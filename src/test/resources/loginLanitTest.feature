 Feature: test Site Lanit
   Scenario: Login users,open topic,write post, return main page
     Then Site open
     Then click navigation bar button sign in
     Then Input Login
     Then Input Passport
     Then Click sign in
     Then Check visibility icons

   Scenario Outline: write massage,check massage
     Then Open random topic
     Then Click answer
     Then Write text in text box <TEST>
     Then Send a response
     Then Check that your message is displayed <TEST>
     Then Go to the main page
     Then Repeat steps <TEST>

     Examples:
       |   TEST        |
       |   Version1    |
       |   Version2    |
       |   Version3    |
       |   Version4    |
       |   Version5    |
       |   Version6    |
       |   Version7    |
       |   Version8    |
       |   Version9    |
       |   Version10   |
       |   Version11   |
       |   Version12   |
       |   Version13   |





