$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginSteps.feature");
formatter.feature({
  "line": 2,
  "name": "Feature to test login functionality",
  "description": "",
  "id": "feature-to-test-login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Check login is successful with valid credentials",
  "description": "",
  "id": "feature-to-test-login-functionality;check-login-is-successful-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters username and password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Clicks on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User is navigated to the home page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});