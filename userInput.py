print("Welcome to the simple banking system!")
print("please choose to an option you wanted to do")

print("1. Check Balance")
print("2. Deposit")
print("3. Withdraw")
print("4. Exit")

balance = 0.0
while True:
    choice = input("Enter your choice (1-4): ")

    if choice == "1":
        print(f"Your current balance is: {balance:.2f}")
    elif choice == "2":
        amount = int(input("Enter the amount you want to deposit: "))
        balance += amount
        print(f"you have deposited {amount:.2f}. amount added to your balance.")
    elif choice == "3":
        amount = int(input("enter amount you wanted to withdraw: "))
        if amount > balance:
            print("theres not enough balance to withdraw in your account.")
        else:
            balance -= amount
            print(f"you have withdrawn {amount:.2f} from your account.")
    elif choice == "4":
        print("Thank u for using our simple bank system!")
        break
    else:
        print("Invalid choice. Please enter a number between 1 and 4.")