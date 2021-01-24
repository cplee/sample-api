Feature: Basic API tests

Background:
* url baseUrl

Scenario: Verify health actuator
Given path '/actuator/health'
When method GET
Then status 200
And match $.status == 'UP'

Scenario: Verify GET / is working
Given path '/'
When method GET
Then status 200
And match $.message == 'Welcome to the machine.'
And match $.timestamp == '#present'