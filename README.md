# Aula 3 - Introdução a MVC e injeção de dependências - TT

## Star Wars

Este repositório contém a resolução do exercício prático.

- GET ```` /aula3/tt/personagens/{nome} ````
    - retorna uma lista de nomes de personagens que contenham a cadeia de caracteres passada via @PathVariable.
    - body response:
    ````
    {
        "names": [
            "Darth Vader",
            "Darth Maul"
        ]
    }
    ````