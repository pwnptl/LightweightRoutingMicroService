# Lightweight Routing Microservice 

## 1. Use-cases 

## 2. How to use

## 3. Testing 

## 4. Road Runner (Not Running)

``` text
                            /  \      __  
.---.                  _   /   /   _.~  \
\    `.               / \ /   /.-~    __/
`\    \              |  |   |/    .-~ __
\    \             |  |   |   .'--~~  \
\    \            |  |   `  ' _______/
\    \           |  `        /
.--. \    \          |    `     /
\   `.\    \          \        /
`\   \     \          `\     (
\   \     \           > ,-.-.
\   `.    \         /  |  \ \
\    .    \       /___| O |O\     ,
.-. \    ;    |    /`    `^-.\.-'`--'/
\  `;         |   |                 /
`\  \        |   `.     `--..____,'
\  `.      |     `._     _.-'^
\   .     /         `|`|`
.-.\       /           | |
\  `\     /            | |
`\  `   |             | |
\     |             | |
.-.    |             | |
\  `.   \            | |
`\      \           | |
\      \          | |
\_____ :-'~~~~~'-' ;
/____;``-.         :
<____(     `.       ;
\___\     ;     .'
/``--'~___.-'
/\___/^/__/
/   /' /`/'
\  \   `\ \
`\ \    \ \
\ \    \ \
\ \    \ \
\ \    \ \     ______
\ \ ___\ \'~``______)>
  \ \   \ \___ _______ __)>
_____\ \'~``______)>
<(_______.._______)>

```

```
⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜
⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬜⬜⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜
⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬜⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜
⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜⬛⬛⬛⬜⬜⬜⬜
⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛⬛🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨⬛⬛⬜⬜⬜⬜⬜⬜⬜
⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨⬛⬛⬜⬜⬜⬜⬜
⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛🟨🟨🟨🟨🟨⬛⬛🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨⬛⬜⬜⬜⬜
⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛🟨🟨🟨🟨🟨⬛🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨⬛⬛⬜⬜⬜
⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨⬛⬛⬜⬜
⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛🟨🟨🟨🟨🟨⬛🟨⬛🟨⬛🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨⬛⬜⬜
⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛🟨🟨🟨🟨🟨🟨⬛🟨⬛🟨⬛🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨⬛⬜⬜
⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛🟨🟨🟨🟨🟨🟨🟨⬛🟨⬛⬛⬛🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨⬛🟨⬛⬜
⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛🟨🟨🟨🟨🟨🟨🟨🟨⬛⬜⬜⬜⬛🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨⬛🟨⬛
⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛🟨🟨🟨🟨🟨🟨🟨⬛⬜⬜⬜⬜⬛🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨⬛🟨⬛🟨⬛
⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛🟨🟨🟨🟨🟨🟨🟨⬛⬜⬜⬜⬜⬛🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨⬛🟨🟨🟨⬛
⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛🟨🟨🟨🟨🟨🟨⬛⬜⬜⬜⬜⬜⬛🟨🟨🟨🟨🟨🟨🟨⬛⬛⬛🟨🟨⬛🟨⬛
⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛🟨🟨🟨🟨🟨🟨⬛🟦🟦⬜⬜⬜⬛🟨🟨🟨🟨🟨🟨⬛⬜⬜⬛⬛⬛🟨🟨⬛
⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛🟨🟨🟨🟨🟨🟨⬛⬛⬛🟦⬜⬜⬛🟨🟨🟨🟨🟨⬛⬜⬜⬜⬛⬛🟨🟨🟨⬛
⬜⬜⬜⬜⬜⬜⬜⬛⬜⬛🟨🟨🟨🟨🟨🟨⬛⬛⬛🟦⬜⬜⬛🟨🟨🟨🟨⬛⬜⬜⬜⬜⬛🟨⬛⬛🟨⬛
⬜⬜⬜⬜⬜⬜⬛🟨⬛⬜⬛🟨🟨🟨🟨🟨⬛⬛⬛🟦⬜⬛🟨🟨🟨🟨⬛🟦🟦⬜⬜⬜⬛🟨🟨🟨🟨⬛
⬜⬜⬜⬜⬜⬜⬛🟨🟨⬛⬜⬛🟨🟨🟨🟨⬛⬛⬛🟦⬜⬛🟨🟨🟨🟨⬛⬛🟦🟦⬜⬜⬛🟨🟨🟨🟨⬛
⬜⬜⬜⬜⬜⬜⬛🟨🟨⬛⬜⬛🟨🟨🟨🟨⬛⬛🟦⬜⬛🟨🟨🟨🟨⬛⬛⬛⬛🟦⬜⬛🟨🟨🟨🟨⬛⬜
⬜⬜⬜⬜⬜⬜⬛🟨🟨⬛⬜⬛🟨🟨🟨🟨🟨⬛⬛⬛🟨🟨🟨🟨🟨⬛⬛⬛⬛🟦⬛🟨🟨🟨🟨⬛⬜⬜
⬜⬜⬜⬜⬜⬜⬛🟨🟨⬛⬜⬛🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨⬛⬛⬛🟦⬛🟨🟨🟨🟨⬛⬜⬜⬜
⬜⬜⬜⬜⬛⬛⬜⬛🟨⬛⬛⬛🟨🟨🟨🟨🟨🟨🟨🟨🟧🟧🟧🟨🟨⬛⬛🟦⬛🟨🟨🟨🟨⬛⬜⬜⬜⬜
⬜⬜⬛⬛🟧🟧⬛🟨⬛🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟧🏾🏾🏾🟧🟨⬛⬛⬛🟨🟨🟨🟨⬛⬜⬜⬜⬜⬜
⬜⬛🟧🟧🟧🟧⬛🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟧🟧🟧🟨🟨🟨🟨🟨🟨🟨🟨⬛⬜⬜⬜⬜⬜⬜
⬛🟧🟧🟧🟧🟧⬛🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨⬛⬜⬜⬜⬜⬜⬜
⬛🟧🟧🟧🟧🟧⬛🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜
⬛🟧🟧🟧🟧🟧🟧⬛⬛🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨⬛⬛⬛🟨🟨⬛⬜⬜⬜⬜⬜⬜⬜
⬛🟧🟧🟧🟧🟧🟧🟧🟧⬛🟨🟨🟨🟨🟨🟨🟨🟨⬛🟨🟨⬛⬛⬛⬛🟨🟨🟨🟨🟨⬛⬜⬜⬜⬜⬜⬜⬜
⬜⬛🟧🟧🟧🟧🟧🟧🟧⬛🟨🟨🟨🟨🟨🟨🟨🟨⬛🟨🟨🟨⬛🟨⬛🟨🟨🟨🟨⬛⬛⬜⬜⬜⬜⬜⬜⬜
⬜⬛🟧🟧🟧🟧🟧🟧⬛⬛🟨🟨🟨🟨🟨🟨🟨🟨⬛🟨🟨🟨⬛🟨⬛🟨🟨🟨⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜
⬜⬜⬛🟧🟧🟧⬛⬛⬜⬜⬛🟨🟨🟨🟨🟨🟨🟨⬛⬛⬛⬛🟨🟨🟨🟨🟨🟨⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜
⬜⬜⬜⬛⬛⬛⬜⬜⬜⬜⬜⬛⬛🟨🟨🟨⬛⬛⬛⬜⬜⬜⬛⬛⬛🟨🟨🟨⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜
⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜


⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜
⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛⬜⬜⬛⬜⬜⬜⬜⬜⬜⬜⬜
⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜
⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜
⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬜⬜⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜
⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜
⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬜⬛⬛⬛⬛⬜⬛⬛⬛⬜⬜⬜⬜⬜
⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛⬛⬛⬛⬛⬛⬜⬛⬛⬜⬜⬜⬜⬜
⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬜⬛⬛⬜⬜⬛⬛⬛⬛⬛⬜⬜⬜⬜
⬜⬜⬜⬜⬜⬜⬜⬜⬛⬜⬜⬛⬜⬜⬜⬜⬛⬛⬛⬛⬜⬜⬜⬜
⬜⬜⬜⬜⬜⬜⬜⬜⬛⬜⬜⬛⬜⬜⬜⬜⬛⬛⬛⬛⬜⬜⬜⬜
⬜⬜⬜⬜⬜⬜⬜⬜⬛⬜🏽⬛⬜⬜⬜⬜⬛⬛⬛⬛⬜⬜⬜⬜
⬜⬜⬜⬜⬜⬜⬜⬜⬛⬜⬛⬛⬜⬜🏽⬛⬛⬛⬛⬛⬜⬜⬜⬜
⬜⬜⬜⬜⬜⬜⬜⬛⬛🏽⬛⬛🏽🏽⬛⬛⬛⬛⬛⬛⬛⬜⬜⬜
⬜⬜⬜⬜⬜⬜⬛🟨🟨⬛🟧🟧⬛🏽⬛⬛⬛⬛🟨🟨🟧⬛⬜⬜
⬜⬛⬛⬛⬛⬜⬛⬛⬛🟨🟨🟨🟧⬛⬛⬛🟨🟨🟨🟨🟨🟧⬛⬜
⬛🟨🟨🟨🟨⬛⬛🟨🟨🟨🟨⬛🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟧⬛
⬛🟧🟧🟧🟧🟨🟨⬛🟧🟨🟨🟨🟨🟨🟨⬛⬛⬛⬛⬛🟨🟧🟧⬛
⬜⬛🟧🟧⬛⬛🟧🟨🟨🟧🟧🟨🟨🟨🟨🟨🟧⬛🟧🟧🟧🟧🟧⬛
⬜⬜⬛⬛🟧🟧⬛🟧🟨🟨🟨🟨🟨🟨🟨🟨🟧⬛🟧🟧🟧🟧⬛⬜
⬜⬜⬜⬜⬛⬛⬛⬛🟧🟨🟨🟨🟨🟨🟨🟧⬛🟧🟧🟧⬛⬛⬜⬜
⬜⬜⬜⬜⬜⬜⬜⬜⬛🟧🟧🟨🟨🟨🟧⬛⬛⬛⬛⬛⬜⬜⬜⬜
⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛🟧🟧🟧⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜
⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜
⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬜⬜⬜⬛⬜⬜⬜⬜⬜⬜⬜⬜
⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬜⬜⬜⬛⬜⬜⬜⬜⬜⬜⬜
⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜
```