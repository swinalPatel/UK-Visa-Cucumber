Feature: Confirm whether a visa is required to visit the UK

Scenario: UK student visa information
Given I provide a nationality of Japan
And I select the reason Study 
And I state I am intending to stay for longer than 6 months
When I submit the form
Then I will be informed that You will need a visa to study in the UK