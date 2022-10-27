MYTASK1: THERE IS NEED FOR MICROSERVICE ARCHITECTURE,USING REST API TO INTEGRATE WITH THE ANDROID APP.THIS
ALLOW ANY KIND OF SERVICE TO BE BUILT AS A STAND ALONE AND CONSUME BY MANY APPLICATIONS.
THIS TASK IS TO ALLOW DATA TO BE AVAILABLE IN REMOTE ENVIRONMENT AS THE DATA IS DOWNLAODED FROM THE DB DURING ONLINE AND
THIS DATA BEEN DOWNLOADED CAN BE USE OFFLINE FOR ANY DECISION AND TREATMENT.
STATUS: THIS IS COMPLETED BUT THE COLUMN NEED
TO BE UPDATED WITH THE CURRENT LIVE HEALTH DATABASE




MYTASK2:   DESIGN OF UPLOADING OFFLINE DATA TO THE DATABASE .DATA CAN BE TAKEN OFFLINE AND LATER UPLOADED WHEN
THERE IS INTERNET SESSION.
STATUS: THIS IS ONGOING






MYTASK3:   DESIGN OF MAIL SERVICE TO SEND PATIENT RESULT AS PDF TO THEM.
STATUS:ONGOING


# Creating Single Excel Sheet from Existing Database Records

###### POC to demonstrate Generating Excel file (.xlsx) with single sheet with data coming from a database using Apache-POI library.

<center>
	<a target='_blank' href='http://localhost:8089/swagger-ui.html'>CLICK HERE TO VIEW API DOCS (Deployed Swagger-UI)</a>
</center>

## Tech Stack

* Java 15
* Spring Boot
* Apache POI
* H2 Database
* Open-API (Swagger-ui)

## Flow

* 300 employees are saved into the database on startup with dummy values **(com.typhoid.sannimichael.patient.bootstrap.PatientDataPopulationOnBootstrap.java)**
* Controller endpoint is provided to create additional employees in the system
* Controller endpoint to generate excel file representing all employees in the system

## Local Setup

* Install Java 15
* Install Maven

Recommended way is to use [sdkman](https://sdkman.io/) for installing both maven and java

Run the below commands in the core

```
mvn clean install
```

```
mvn spring-boot:run

```

server port is configured to 8089 which can be changed in application.properties file

Go to the below url to view swagger-ui (API docs)

```
http://localhost:8089/swagger-ui.html
```