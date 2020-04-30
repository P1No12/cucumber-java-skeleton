 Feature: test Site Lanit
   Scenario: Login users
     When Site open, click sign in
     Then Input Login
     Then Input Passport
     Then Click sign in
     Then Check visibility icons
