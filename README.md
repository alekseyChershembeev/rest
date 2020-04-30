# RestApi 


## Curl tests:

- ### GetAll


    curl -v localhost:8080/employees

------------

- ### GetOne


    curl -v localhost:8080/employees/99

------------

- ### PostOne


    curl -X POST localhost:8080/employees -H 'Content-type:application/json' -d '{"name": "Samwise Gamgee", "role": "gardener"}'
------------

- ### PutOne


    curl -X PUT localhost:8080/employees/3 -H 'Content-type:application/json' -d '{"name": "Samwise Gamgee", "role": "ring bearer"}

------------
- ### DeleteOne


    curl -X DELETE localhost:8080/employees/3

------------

    curl localhost:8080/employees/3
    
    
    
[RestApi](https://spring.io/guides/tutorials/rest/ "RestApi")










