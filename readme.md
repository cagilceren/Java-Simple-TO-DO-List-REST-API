<h1 align="center"> JAVA - Simple TO DO List - REST API </h1>
<p>
  <img alt="Version" src="https://img.shields.io/badge/version-1.0.0-blue.svg?cacheSeconds=2592000" />
  <a href="https://github.com/cagilceren/PHP-Simple-TO-DO-List-REST-API/blob/main/README.md" target="_blank">
    <img alt="Documentation" src="https://img.shields.io/badge/documentation-yes-brightgreen.svg" />
  </a>
  <a href="https://github.com/cagilceren/PHP-Simple-TO-DO-List-REST-API/graphs/commit-activity" target="_blank">
    <img alt="Maintenance" src="https://img.shields.io/badge/Maintained%3F-yes-green.svg" />
  </a>
</p>
<p>

 </p>

<br>

This project has been created as a part of self-learning. 

In this project, I have created REST API Service for a TO-DO App.  

## Build With

- Java
- MySQL
- JPA
- Spring
- Maven

## Tools & Technologies

- Postman
- JSON
- Rest API

## Highlights

In this project I have used different modules for different compartments in the project, so that the project is easily upgradeable. 

During the project I have used Spring framework and JPA, which offer many facilities while creating Java REST API Services. That is why, I didn't have to manually deal with many things, like SQL Injection and creating JSON documents (see: [PHP Rest API](https://github.com/cagilceren/PHP-Simple-TO-DO-List-REST-API.git)). 

Thanks to Java persistence API (JPA), I have created an Entity class (named [Reminder.java](https://github.com/cagilceren/Java-Simple-TO-DO-List-REST-API/blob/master/src/main/java/com/example/restservice/model/Reminder.java)) to be able to communicate with the database.

Thanks to the Spring framework, I created CRUD functions based on [RESTful web API design](https://docs.microsoft.com/en-us/azure/architecture/best-practices/api-design) by related annotations. These CRUD functions are

- to **Create** a new reminder to the database "post()",
	
- to **Read** a existing reminder in the database "get()",
	
- to **Update** an existing reminder in the database "put()",
	
- to **Delete** an existing reminder from the database "delete()".


Additionally, I have created a "getAll()" function in order to get all the existing reminders in the database.

In the functions I have checked the possible error resources and threw a related Exception. Successful requests return "HTTP 200 OK" while unsuccessful ones return "HTTP 400 Bad Request" or "HTTP 404 Not Found".


## Usage

> 1) Clone the repository to your local machine

```sh
$ git clone https://github.com/cagilceren/Java-Simple-TO-DO-List-REST-API.git
```

> 2) Install MySQL Workbench and MySQL Server. Import the file "[reminder.sql](https://github.com/cagilceren/Java-Simple-TO-DO-List-REST-API/blob/master/reminder.sql)".

> [Download MySQL Workbench](https://dev.mysql.com/downloads/workbench/)

> 3) Install Postman and import the file "[reminder.postman_collection.json](https://github.com/cagilceren/Java-Simple-TO-DO-List-REST-API/blob/master/reminder.postman_collection.json)".

> [Download Postman](https://www.postman.com/downloads/)

> 4) Open the file "[application.properties](https://github.com/cagilceren/Java-Simple-TO-DO-List-REST-API/blob/master/src/main/resources/application.properties)" under the folder rest-service/src/main/resources in your favorite editor to be able to check and update the code as your credential.

> 5) Go to the repository folder and run the project 

```sh
$ cd ./Java-Simple-TO-DO-List-REST-API
$ mvn spring-boot:run

```

## Authors

<img src="https://avatars.githubusercontent.com/u/45261915?v=2" width="25" height="25"> **Cagil Ceren Aslan**




- Github: [@cagilceren](https://github.com/cagilceren)

## Contributing

I am happy to have some improvement ideas for my project :)
