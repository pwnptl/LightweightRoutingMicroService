package com.gameverse.routing.service;

import com.gameverse.routing.model.Route;
import com.gameverse.routing.utils.Constant;
import com.gameverse.routing.utils.JsonFileManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class RoutingService {
    private final Logger logger = LoggerFactory.getLogger(RoutingService.class);

    private final JsonFileManager jsonFileManager = new JsonFileManager(Constant.Routing.ROUTING_STORE_JSON_FILE);

    /**
     * Fallback mechanism in case the routing file is updated with error,
     * we should use the previous routing config only.
     * This Cache will be updated on each successful CaffineCache-TTL.
     */
    private ArrayList<Route> pastRouteCache;

    public RoutingService() {
        pastRouteCache = null;
    }

    /**
     * Cached Result in CaffeineCacheManager with the given key.
     * Also contains the fallback scenario of faulty json file.
     *
     * @param key dummy key right now as required param by Caffeine.
     * @return all Routes for the service.
     */
    @Cacheable(Constant.Cache.CACHE_NAME)
    public List<Route> getAllRoutes(String key) {
        ArrayList<Route> routes;
        try {
            routes = getRoutes();
            logger.info("key {}, routes {}", key, routes);
            updateToPastCache(routes);
        } catch (RuntimeException e) {
            logger.error("Unable to load latest cache, using prev cache available");
            routes = usePastCache();
        }
        return routes;
    }

    private void updateToPastCache(ArrayList<Route> routes) {
        try {
            pastRouteCache = routes;
        } catch (Exception e) {
            // nothing
        }
    }

    private ArrayList<Route> usePastCache() {
        if (pastRouteCache != null)
            return pastRouteCache;
        else
            throw new RuntimeException("Past Cache Missing");
    }

    private ArrayList<Route> getRoutes() {
        // todo: fetch using the file.
        ArrayList<Route> routes = new ArrayList<>();
        Route route = new Route("/a", new HashMap<>(), "http://localhost:8090");
        routes.add(route);
        return routes;
    }
}
