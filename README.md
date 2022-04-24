# besthack'22

### Постановка задачи
Данная нам на решение проблема заключается в поиске и реализации метода преобразования данных о заправках с целью встриавания их в специально созданную для этих целей базу данных.
Сложность задачи состоит в том, что мы не знаем, что получит наш микросервис, будь то запрос или файл. Также мы не можем быть уверены, что все поля входных данных будут соответствовать имеющимся в таблице

---
### Примененный метод решения задачи.
Наше решение состоит в том, чтобы получить REST-запрос от пользователя микросервиса. После обработки данного запроса на [контроллере](https://github.com/notblank00/besthack-22/blob/main/besthack22/src/main/java/ru/baza134/besthack22/controllers/StationController.java), мы получаем общую информацию о переданном файле или url-ссылке с запросом. После этого входной поток проходит через модуль [fetcher](https://github.com/notblank00/besthack-22/tree/main/besthack22/src/main/java/ru/baza134/besthack22/fetchers). Если нам был передан url, то мы делаем из него, запрос и передаем ответ дальше [фабрике](https://github.com/notblank00/besthack-22/tree/main/besthack22/src/main/java/ru/baza134/besthack22/factories), где определяются новые записи в базу данных.

[//]: # (todo, вставить сюда пайплайн Вадима)

--- 
### Проблемы, с которыми мы столкнулись в процессе работы и их решения