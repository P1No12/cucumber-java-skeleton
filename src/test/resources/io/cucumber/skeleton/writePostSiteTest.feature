Feature: Write post
  Scenario: Write post and return main page
    When Choose a random topic, not a survey
    Then Open topic
    Then Click answer
    Then Write text in text box
    Then Send a response
    Then Check that your message is displayed
    Then Go to the main page
    Then Repeat steps