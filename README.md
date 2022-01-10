# eCommerce Machine-Code

## List of valid inputs

### 1. login / signup
### 2. view all products
### 3. buy productName
### 4. view cart
### 5. checkout 
### 6. exit
### 7. logout

## Commands exclusive to admin 
### 1. add product (then the admin is asked for productName, productPrice, id, desc)
### 2. delete productName


# Sample input / output
```
------ LIST OF COMMANDS -------
>> view all products : to view all available products
>> buy itemName : to buy a product
>> view cart : to view items added to your cart
>> checkout : to check out and pay
>> exit : to stop using our system
-------------------------------
Do you want to signup or login?
login
Enter the user id : 
1
Enter the password : 
admin
add product
Enter product name : 
macbook air
Enter product id : 
9899
Enter product desc : 
512GB m1 2021
Enter product price : 
199990
macbook air was added to the warehouse
add product
Enter product name : 
sony bravia
Enter product id : 
98112
Enter product desc : 
89 inch black wall mount
Enter product price : 
90000
sony bravia was added to the warehouse
add product
Enter product name : 
PS5
Enter product id : 
98332
Enter product desc : 
digital edition 
Enter product price : 
47000
ps5 was added to the warehouse
logout
User logged out!
Do you want to signup or login?
signup
Enter the user id : 
1990
Enter the password : 
shubham@123
Enter your address : 
New Delhi
Enter your DOB : 
26/01/2000
New account created for 1990
Welcome 1990
view products
INVALID COMMAND!
view all products
-------- AVAILABLE ITEMS --------
ps5 47000.0 digital edition  98332
sony bravia 90000.0 89 inch black wall mount 98112
macbook air 199990.0 512GB m1 2021 9899
buy ps5
ps5 added to cart of user 1990
buy sony bravia
sony bravia added to cart of user 1990
view cart
Viewing the items added to your cart
Item Name : ps5 price : 47000.0
Item Name : sony bravia price : 90000.0
buy fridge 
The product does not exists
checkout
-------- Checking out --------
Viewing the items added to your cart
Item Name : ps5 price : 47000.0
Item Name : sony bravia price : 90000.0
Total Payable Amount = Rs 137000.0
checkout
-------- Checking out --------
Viewing the items added to your cart
Total Payable Amount = Rs 0.0
exit
Thank you for shopping with us!
```
