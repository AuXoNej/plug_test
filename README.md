# plug_test

Собираем проект в JAR-файл, запускаем. 

Далее отправляем запрос. Сделать это можно двумя способами.
1) В терминале вводиим команду 
      curl --location --request POST 'localhost:8080/ok' \
      --header 'Content-Type: application/json' \
      --data-raw '{
      "id": 3, 
      "name": "Ivan"
      }'
2) С помощью Postman
    Открываем Postman
    Выбираем Post
    В адрес вводим http://localhost:8080/ok
    Выбираем body - raw - json
    Вводим json (например
    {
      "id": 3,
      "name": "Ivan"
    })
    Нажимаем send
    Получаем ответ
    

В запрос передается id и в зависимости от него получаеи разные ответы.
Также для разных id разное время ответа на запрос.

Для примера json
Время ожидания: 5 сек
Ответ: {
          "kooficent": 1,
          "id": 3
       }
