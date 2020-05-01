 Feature: test Site Lanit
   Scenario: Login users,open topic,write post, return main page
     Then Site open
     Then click navigation bar button sign in
     Then Input Login
     Then Input Passport
     Then Click sign in
     Then Check visibility icons
     Then Open random topic
     Then Click answer
     Then Write text in text box
     Then Send a response
     Then Check that your message is displayed
     Then Go to the main page
     Then Repeat steps

