package com.gameverse.routing.utils;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonFileManager {
    private String filePath;

    public JsonFileManager(String filePath) {
        this.filePath = filePath;
    }

//    todo:
//    public <T> T readJsonFromFile(Class<T> objectType) {
//        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
//            Gson gson = new Gson();
//            return gson.fromJson(reader, objectType);
//        } catch (IOException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }

    public void writeJsonToFile(Object obj) {
        try (FileWriter writer = new FileWriter(filePath)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(obj, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
