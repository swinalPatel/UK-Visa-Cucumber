$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/cucumber/features/ukvisainformation.feature");
formatter.feature({
  "name": "Confirm whether a visa is required to visit the UK",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "UK visa information for Japan Student",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@JapanStudyVisa"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I provide a nationality of Japan",
  "keyword": "Given "
});
formatter.match({
  "location": "JapanStudentVisaSteps.provide_nationality(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select the reason Study",
  "keyword": "And "
});
formatter.match({
  "location": "JapanStudentVisaSteps.select_reason(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I state I am intending to stay for longer than 6 months",
  "keyword": "And "
});
formatter.match({
  "location": "JapanStudentVisaSteps.intend_to_stay(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I submit the form",
  "keyword": "When "
});
formatter.match({
  "location": "JapanStudentVisaSteps.submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I will be informed that You will need a visa to study in the UK",
  "keyword": "Then "
});
formatter.match({
  "location": "JapanStudentVisaSteps.visa_information(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "UK visa information for Japan Tourism",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@JapanTourismVisa"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I provide a nationality of Japan",
  "keyword": "Given "
});
formatter.match({
  "location": "JapanStudentVisaSteps.provide_nationality(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select the reason Tourism",
  "keyword": "And "
});
formatter.match({
  "location": "JapanStudentVisaSteps.select_reason(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I submit the form",
  "keyword": "When "
});
formatter.match({
  "location": "JapanStudentVisaSteps.submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I will be informed that You will not need a visa to come to the UK",
  "keyword": "Then "
});
formatter.match({
  "location": "JapanStudentVisaSteps.visa_information(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "UK visa information for Russia Tourism",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@RussiaTourismVisa"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I provide a nationality of Russia",
  "keyword": "Given "
});
formatter.match({
  "location": "JapanStudentVisaSteps.provide_nationality(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select the reason Tourism",
  "keyword": "And "
});
formatter.match({
  "location": "JapanStudentVisaSteps.select_reason(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I state No I am not travelling or visiting a partner or family",
  "keyword": "And "
});
formatter.match({
  "location": "JapanStudentVisaSteps.reason_to_travel(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I submit the form",
  "keyword": "When "
});
formatter.match({
  "location": "JapanStudentVisaSteps.submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I will be informed that You will need a visa to come to the UK",
  "keyword": "Then "
});
formatter.match({
  "location": "JapanStudentVisaSteps.visa_information(String)"
});
formatter.result({
  "status": "passed"
});
});