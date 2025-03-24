
class BankAccount {

    private double balance; // Private field

    // Constructor
    BankAccount(double balance) {
        this.balance = balance;
    }

    // Getter method (to access balance)
    public double getBalance() {
        return balance;
    }

    // Setter method (to modify balance)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
}

public class BankExample {

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(5000);

        // Getting the balance
        System.out.println("Current Balance: " + myAccount.getBalance());

        // Depositing money
        myAccount.deposit(1500);

        // Checking updated balance
        System.out.println("Updated Balance: " + myAccount.getBalance());
    }
}

/*
Output:
    Current Balance: 5000.0
    Deposited: 1500.0
    Updated Balance: 6500.0

Explanation:
    - In this example, we define a BankAccount class with a private field balance.
    - The BankAccount class has a constructor that initializes the balance.
    - We provide getter and setter methods to access and modify the balance field.
    - The deposit method allows us to deposit money into the account, updating the balance accordingly.
    - In the main method, we create an instance of the BankAccount class and demonstrate depositing money and checking the updated balance.
    - Encapsulation allows us to protect the internal state of an object and control access to its data.
    - By making the balance field private and providing getter and setter methods, we encapsulate the balance field and ensure that it can only be accessed and modified through defined methods.
*/
