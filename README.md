


# PrintDrawingSearchAPI - README
## Step #01
1. Run the PrintSearchAPI using Spring Tools Suite as a maven project. The PrintSearchAPI program will
create the database named "printdrawingdatabase" and a table named "printdrawings".
2. Use the .sql file named "PrintDrawings.sql" to fill up the "printdrawings" table with the data.
3. Import the "Print Drawing API-ScottMichaelAnderson.postman_collection" into Postman to create the collection for interacting
with the PrintSearchAPI @RestController endpoints.


## Step #02

1. Using Spring Tools Suite (or your preferred IDE), open PrintDrawingSearchAPI.

2. Run the PrintDrawingSearchAPI as a "Spring Boot App".

3. Use the Postman API Platform and import the following .json file into Postman.
- "Print Drawing API-ScottMichaelAnderson.postman_collection.json"

## Step #03

1. Register your user at `http://localhost:8080/register/user`.
2. Enter username and password.

## Step #04

1. Authenticate your username and password at `http://localhost:8080/api/authenticate`
2. If authentication is successful you will receive a Bearer Token.
3. Use the Bearer Token to access the other endpoints.


### Note: Bearer Token allows access to the following endpoints
-   GET ALL PRINTS --> `http://localhost:8080/api/print?pageNo=0&pageSize=10`
- FILTER BY DIAMETER AND FACE LENGTH --> `[http://localhost:8080/admin/activeuser](http://localhost:8080/api/pagination/0/10?sortField=diameterLow&diameterMinValue=7.1&diameterMaxValue=7.2&faceLengthMinValue=40&faceLengthMaxValue=50)`
-   UPDATE PRINT BY ID --> `http://localhost:8080/api/print/update/{id}`
-   GET PRINT BY ID --> `http://localhost:8080/api/print/{id}`
-   DELETE USER BY ID --> `http://localhost:8080/api/print/delete/{id}`


###properties
PROD_DB_HOST=mysql.railway.internal
PROD_DB_PORT=3306
PROD_DB_NAME=railway
PROD_DB_PASSWORD=EIzIKIRXIilWUheuIYjQCJKXGTGgqVhK
PROD_DB_USERNAME=root


spring:
application:
name: PrintDrawingSearchAPI

datasource:
url: jdbc:mysql://localhost:3306/printdrawingsdatabase?createDatabaseIfNotExist=true
username: root
password: five2one
driver-class-name: com.mysql.cj.jdbc.Driver
jpa:
hibernate:
ddl-auto: none