
##  🧭Microservices:
- Account Service: Responsible for creating savings accounts, checking balances, and listing transactions.
- Transaction Service: Handles deposit and withdrawal transactions.
- Customer Service (Optional): Manages customer information associated with accounts.

##  🌟Features:
- Testing: Written comprehensive unit tests using JUnit 5 and MockK.
- Microservices: Created the 2 mandatory microservices with runnable docker configuration.
- Database: Used mongoDB for the most simple showcase. It is also integrated with docker.
- REST API: Check out the available routes on the user microservice.
- Architecture: Clear separation by microservices/responsibilities. For more insight please see the linked image below:

![image](https://github.com/patrikkarolyi/bank_backend/assets/25804258/4c226db0-7d33-4897-a09b-eb3679eea6be)


##  📜TODOs:
- API Gateway: No API Gateway for the sake of simplicity.
- Database: Each microservice should have its own database but again for simplicity I only implemented one.
- Communication: No communication between services right now but it can be done by RESTful APIs.
- Security: No security right now but it should use JWT for token-based authentication or some OAuth solution.
- Exception Handling: Slight exception handling is implemented with 2xx and 4xx HTTP status code responses.
- Logging and Monitoring: Not implemented.

## 🗣️User Stories:
Epic: Account Management

- As a customer, I want to create a savings account, so that I can start managing my finances.

- As a customer, I want to view my available balance, so that I can monitor my account.

- As a customer, I want to see a list of my last 10 transactions, so that I can track my spending.

Epic: Transactions

- As a customer, I want to deposit money into my account, so that I can increase my balance.

- As a customer, I want to withdraw money from my account, so that I can use it for expenses.

Common Features Across Epics

- As a user, I want the system to handle invalid inputs gracefully and provide meaningful error messages.

- As a user, I want business validations to be in place to ensure transactions and account creation make sense.

Create a Savings Account:

- As a new customer, I want to provide my details to create a savings account, so that I can start using banking services.
Deposit Money:

- As a customer, I want to deposit $100 into my account, so that I can increase my balance.
Withdraw Money:

- As a customer, I want to withdraw $50 from my account, so that I can use it for expenses.
Read Available Balance:

- As a customer, I want to check my available balance, so that I can monitor my financial situation.
List Last 10 Transactions:

- As a customer, I want to see the last 10 transactions on my account, so that I can track my spending.

## ⚙️Config
Each microservice has a dockerfile in it, and both can be started from the root of the project with mongoDB. During my development process, I made sure the following setups ran without any exceptions:
- Unit tests do not need other microservices or DB, just an IDE.
- API calls can be tested only with a running DB.

## 🎀Summary
3 hours is a super short time for this assignment. I only hope I did think about every important aspect that you may think of! 
