  @stories1
  Feature: Automation Demo Site
  As a user, I want to learn how to automate in screenplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: Registration on the page Web Automation Demo Site
    Given Carlos wants to access the Web Automation Demo Site
    When he performs the registration on the page
    |firstname |lastname |address        |email                    |phone      |languages |skills |country |select_country |year |month |day |password1     |password2 |
    |CARLOS   |RIOS      |PANAMA, PANAMA |carlos.rios@micorreo.com |0315551234 |Spanish   |C      |Panama  |Australia      |1980 |June  |21  |Contraseña123-|Contraseña123- |
    Then Verify that the screen loads with text - Double Click on Edit Icon to EDIT the Table Row.