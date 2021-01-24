![CI](https://github.com/cplee/sample-api/workflows/CI/badge.svg)
[![codecov](https://codecov.io/gh/cplee/sample-api/branch/main/graph/badge.svg?token=9BZSY21O9R)](https://codecov.io/gh/cplee/sample-api)

# Overview

Sample API that exposes a single endpoint `/` and returns JSON:

```
{
  "timestamp": "2021-01-24T17:38:32.300684Z",
  "message":"Welcome to the machine."
}
```

# Test Strategy
This repo demonstrates multiple [test strategies](https://martinfowler.com/articles/microservice-testing/:

* `Unit` - [JUnit5](https://junit.org/junit5/docs/current/user-guide/) was used to define unit tests for all code. [JaCoCo](https://www.eclemma.org/jacoco/) was used to measure code coverage.
* `Component` - Spring Boot's [WebMvcTest](https://spring.io/guides/gs/testing-web/) was used to test the controllers. 
* `E2E` - [Testcontainers](https://www.testcontainers.org/) was used to run the application in container and [Karate](https://intuit.github.io/karate/) was used to define the API tests.

These tests can be run locally via `mvn verify`. Additionally, these tests are performed on each push to GitHub via [Actions](https://docs.github.com/en/actions). Code coverage is measured over time via [Codecov](https://about.codecov.io/)