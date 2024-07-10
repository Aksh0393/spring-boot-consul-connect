
# Spring Boot Consul Connect

This project is a sample Spring Boot application that integrates with Consul for service discovery and configuration management. It demonstrates how to set up and use Consul Connect for secure service-to-service communication.

## Table of Contents
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
  - [Clone the Repository](#clone-the-repository)
  - [Build the Project](#build-the-project)
  - [Configuration](#configuration)
  - [Endpoints](#endpoints)
  - [Consul Setup](#consul-setup)
- [Run the Application](#run-the-application)
- [License](#license)

## Prerequisites
- Java 17 or higher
- Maven 3.6.0 or higher
- Consul v1.19.0 or higher

## Getting Started

### Clone the Repository
```bash
git clone https://github.com/Aksh0393/spring-boot-consul-connect.git
cd spring-boot-consul-connect
```

### Build the Project
```bash
mvn clean install
```

## Configuration
Configuration properties for the application can be found in the `application.yml` file located in the `src/main/resources` directory. You can configure the Consul host, port, and other settings in this file.

## Endpoints
The application exposes the following endpoints:
- `/v1/hello` - endpoint to check if app is up.
- `/v1/marks/{name}` - endpoint to get value
- `/v1/value?name=<String>&value=<Integer>` - endpoint to set value.

## Consul Setup
To run Consul locally refer [this](https://github.com/Aksh0393/hashicorp-consul-setup-guide/tree/v1.8.7)

```bash

After running Consul, you can access the Consul UI at `http://localhost:8500`.

```
## Run the Application
You can run the Spring Boot application using the following command:
```bash
mvn spring-boot:run
```

Alternatively, you can build a JAR file and run it:
```bash
mvn clean package
java -jar target/spring-boot-consul-connect-0.0.1-SNAPSHOT.jar

Run get.sh and post.sh to test the endpoints.😄
```

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
