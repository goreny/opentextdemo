$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("logintests.feature");
formatter.feature({
  "line": 2,
  "name": "OpenText Tests",
  "description": "",
  "id": "opentext-tests",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@opentext"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "",
  "description": "",
  "id": "opentext-tests;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@opentext.s1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the login view is currently displayed",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the username field is not populated",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the submit button should be disabled",
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
});