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
formatter.before({
  "duration": 8013101500,
  "status": "passed"
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
formatter.match({
  "location": "StepsForLogin.user_is_on_login_page_of_the_website()"
});
formatter.result({
  "duration": 5845824800,
  "status": "passed"
});
formatter.match({
  "location": "StepsForLogin.user_enters_valid_username_and_password()"
});
formatter.result({
  "duration": 2249393600,
  "status": "passed"
});
formatter.match({
  "location": "StepsForLogin.user_enter_login_buutton()"
});
formatter.result({
  "duration": 5037973000,
  "status": "passed"
});
formatter.match({
  "location": "StepsForLogin.user_lands_on_home_page()"
});
formatter.result({
  "duration": 1030933300,
  "status": "passed"
});
formatter.after({
  "duration": 820700000,
  "status": "passed"
});
});