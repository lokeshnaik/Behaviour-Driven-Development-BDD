$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/HooksFeature/HooksLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Login functionality check",
  "description": "",
  "id": "login-functionality-check",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8450396400,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Checking the login functionality with valid credentials",
  "description": "",
  "id": "login-functionality-check;checking-the-login-functionality-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@hooks"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on login page of the website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters valid username and  password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enter login buutton",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User lands on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsForLogin.user_is_on_login_page_of_the_website()"
});
formatter.result({
  "duration": 5636521600,
  "status": "passed"
});
formatter.match({
  "location": "StepsForLogin.user_enters_valid_username_and_password()"
});
formatter.result({
  "duration": 2246861400,
  "status": "passed"
});
formatter.match({
  "location": "StepsForLogin.user_enter_login_buutton()"
});
formatter.result({
  "duration": 5016930100,
  "status": "passed"
});
formatter.match({
  "location": "StepsForLogin.user_lands_on_home_page()"
});
formatter.result({
  "duration": 1033845900,
  "status": "passed"
});
formatter.after({
  "duration": 851299300,
  "status": "passed"
});
});