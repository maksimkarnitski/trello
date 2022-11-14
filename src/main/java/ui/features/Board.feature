Feature: Create Board
  Testing creation of board

  Scenario:
    Given default user logs in
    When user creates new board with name 'New Board on UI'
    Then verify created board with name 'New Board on UI' is opened
