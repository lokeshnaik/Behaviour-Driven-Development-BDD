$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/HooksFeature/HooksLogin.feature");
formatter.feature({
  "line": 2,
  "name": "Login functionality check",
  "description": "",
  "id": "login-functionality-check",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@hooks"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Checking the login functionality with valid credentials",
  "description": "",
  "id": "login-functionality-check;checking-the-login-functionality-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@hooks"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on login page of the website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters valid username and  password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enter login buutton",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User lands on home page",
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