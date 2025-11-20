# Bank Account Simulation 
# Overview
This project is a simple Bank Account Simulation built using Java OOP concepts.
 The program allows the user to:
  Create a bank account
  Deposit money
  Withdraw money
  Check current balance
  View full transaction history
It runs entirely in the console using a menu-driven interface.
# Concepts Used
  Classes & Objects
  Constructors
  Encapsulation
  ArrayList (for transaction history)
  Switch-case
  Java Scanner for user input
# Class Structure
  BankAccount
  Stores account holder name
  Maintains balance
  Keeps transaction history
# Provides methods:
  deposit()
  withdraw()
  showBalance()
  showTransactionHistory()
  Main (BankApp)
  Displays menu
  Accepts user choices
  Calls BankAccount methods
# Sample Output
  Enter Account Holder Name: Kavya
  Enter Initial Balance: 5000
------ Bank Menu ------
1. Deposit
2. Withdraw
3. Check Balance
4. View Transaction History
5. Exit
Enter your choice: 1
Enter deposit amount: 1500
Deposit successful!
