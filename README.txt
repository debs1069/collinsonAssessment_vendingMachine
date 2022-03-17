

Write a program to design Vending Machine using java with all
possible tests
Scenario1: Accepts coins of 1,5,10,25 Cents i.e. penny, nickel, dime, and quarter.
Allow user to select products Coke(25), Pepsi(35), Soda(45)
Allow user to take refund by cancelling the request.
Return selected product and remaining change if any.
Allow reset operation for vending machine supplier.


TestData:Input.Properties file:
accepted.coins=1,5,10,25 penny
input.coins=5,45,5
accept.products=Coke,Pepsi,Soda
input.product=Pepsi


Scenario1: TC_001_AcceptCoinValidation()- validates if entered coins are either 1,5,10,25 Cents else 'please enter coins in 1,5,10,25 Cents ' validation message shown.

Scenario2: TC_002_SelectProductValidation() - validates if product not available then 'select other product' assertion done.

Scenario3: TC_003_RefundValidation() - User enters coin and cancel request. Asserts money is refunded.

Scenario4: TC_004_RemainingChangeValidation() - give selected product and if remaining change greater than 0, assert change is given.
