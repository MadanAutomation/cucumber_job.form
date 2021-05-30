Feature: login functionality test

   Scenario Outline: Enter the job form
    Given First start page
      And I enter the name a Previous_Company_Name '<previous_Company_Name>'
      And I enter the name a Current_Company_Name '<current_Company_Name>'
      And I enter the name a bday_year '<bday_year>'
     When I enter the name a previous_Join_Date '<previous_Join_Date>'
     When I enter the name a Previous_Company_End_Date '<previous_Company_End_Date>'
     When I enter the current_Company_Join_Date '<current_Company_Join_Date>'
     When  I click on Experience '<experience_CLICK>'
     When  I click on QA_Web_Manual '<qa_Web_Manual>'
     When  I click on QA_submit '<qa_submit>'
     And browser quit

    Examples:
      |  previous_Company_Name | current_Company_Name| bday_year   |previous_Join_Date|  previous_Company_End_Date| current_Company_Join_Date  |
      |      Archeesh          |       null          |31/05/1993   |31/05/2017        |       31/05/2019          | 31/05/2020                 |



	