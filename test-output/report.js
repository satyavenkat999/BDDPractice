$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Administrator/eclipse-workspace/BDDPractice/src/main/java/com/qa/crm/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify the Login fuctionality",
  "description": "",
  "id": "login-feature;verify-the-login-fuctionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Browser opened",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Verify the login title",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User entered Username and Password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User clicked on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Home page title got verified",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Browser closed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.browser_opened()"
});
formatter.result({
  "duration": 15963846130,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.verify_the_login_title()"
});
formatter.result({
  "duration": 29268327,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_entered_Username_and_Password()"
});
formatter.result({
  "duration": 316255093,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicked_on_Login_Button()"
});
formatter.result({
  "duration": 5950180117,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.home_page_title_got_verified()"
});
formatter.result({
  "duration": 23435969,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.browser_closed()"
});
formatter.result({
  "duration": 2280805954,
  "status": "passed"
});
});