# Prime Number calculator


### Guides
The following guides illustrate how to use some features concretely for this springboot application:

**References**:

**Software/Framework versions (minimum requirement)**:

* Java 1.8 
* Maven 3.2.2
* Springboot - 2.7.5

**Run**
* To build application, run "mvn clean && mvn install" in root folder of project
* To run application in IDE, run PrimeCalculatorApplication as Java application
* Alternatively can run (if already built) java -jar target/primecalc-0.0.1-SNAPSHOT.jar from project root
* Number of threads to be used are configured in application.properties, which can be changed as needed.
* make sure nothing is running on port 8080 as this application uses port (to change port you can define in resource/application.properties -> server.port=<desired port>)
* Once application is running successfully can use curl command or postman to run following:
 -- URL: http://localhost:8080/primenum.
 -- Method: GET
 -- Parameter: upperLimit (type: Integer)
* Error response for invalid parameter value or missing parameter is defined and results JSON object with error message.
 
 **Example**
 
 * Success:
 * Request URL: http://localhost:8080/primenum?upperLimit=7
 * Response: {"errorMessage":null,"statusCode":200,"success":true,"data":[2,3,5,7]}
 
 * Exception:
 * Request URL: http://localhost:8080/primenum?upperLimit=3.14
 * Response: {"errorMessage":"Please provide valid parameter(Whole number)","statusCode":400,"success":false,"data":null}

 **TO DO**
 - Add swagger definition 
 - Configure response based on request media type 
 - Introducing caching
 - Add more Test cases
 - Add more Exception handling scenario 
 - Externalizing exception messages
