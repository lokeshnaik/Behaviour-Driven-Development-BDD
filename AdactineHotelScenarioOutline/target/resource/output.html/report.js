$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/nopcommerceLogin.feature");
formatter.feature({
  "line": 2,
  "name": "Login functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smokeTest"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Login functionality of nop commerce website",
  "description": "",
  "id": "login-functionality;login-functionality-of-nop-commerce-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on login page of website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enter the username and password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user is on home page of nope commerence website",
  "keyword": "Then "
});
formatter.match({
  "location": "NopCommerceLogin.user_is_on_login_page_of_website()"
});
formatter.result({
  "duration": 10717441700,
  "status": "passed"
});
formatter.match({
  "location": "NopCommerceLogin.user_enter_the_username_and_password()"
});
formatter.result({
  "duration": 2265469400,
  "status": "passed"
});
formatter.match({
  "location": "NopCommerceLogin.clicks_on_login_button()"
});
formatter.result({
  "duration": 4951345300,
  "status": "passed"
});
formatter.match({
  "location": "NopCommerceLogin.user_is_on_home_page_of_nope_commerence_website()"
});
formatter.result({
  "duration": 1205907000,
  "status": "passed"
});
});