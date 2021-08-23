# Description
## Leveraging Java 8, create an application that simulates simple banking transactions
## Requirements
- All interaction with the user should be done through the console using the Scanner class

### As Customers:
- I should be able to register with a username and password, and apply to open an account.
- I should be able to apply for joint accounts
- Once the account is open, I should be able to withdraw, deposit, and transfer funds between accounts

### As Employee
- I should be able to view all of customers information. This includes:
  - Account information
  - Account balances
  - Personal information
- I should be able to approve/deny open applications for accounts

### As Admins
- I should be able to view and edit all accounts
- This includes:
  - Approving/denying accounts
  - withdrawing, depositing, transferring from all accounts
  - canceling accounts
  - All information should be persisted using text files and serialization

### As System:
- All basic validation should be done, such as trying to input negative amounts, overdrawing from accounts etc.
- All transactions should be logged.
