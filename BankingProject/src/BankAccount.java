import java.util.Scanner;

public class BankAccount {
    int balance;
    int previousTransection;
    String customerName,customerId;

    BankAccount(String cname, String cid){
        customerName = cname;
        customerId = cid;
    }

    void deposit(int amount){
        if(amount != 0 ){
            balance+=amount;
            previousTransection = amount;
        }
    }

    void withdraw(int amount){
        if (amount != 0){
            balance -= amount;
            previousTransection = amount;
        }
    }

    void getPreviousTransection(){
        if (previousTransection > 0){
            System.out.println("Deposit : "+previousTransection);
        }
        else if (previousTransection < 0){
            System.out.println("Withdraw : "+Math.abs(previousTransection));
        }
        else
        {
            System.out.println("NO transection Occured");
        }
    }

    void showMenu(){
        char option='\0';
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome : "+customerName);
        System.out.println("Your Id is : "+customerId);
        System.out.println("A, Check Balance");
        System.out.println("B, Deposit");
        System.out.println("C, Withdraw");
        System.out.println("D, PreviousTransection");
        System.out.println("E, Exit");

        do {
            System.out.println("============================================");
            System.out.println("Enter an option");
            System.out.println("============================================");
            option=sc.next().charAt(0);

            switch (option){
                case 'A' :
                    System.out.println("============================================");
                    System.out.println("Balance : "+balance);
                    System.out.println("============================================");
                    System.out.println("\n");
                    break;

                case 'B' :
                    System.out.println("============================================");
                    System.out.println("Enter an amount to deposit");
                    System.out.println("============================================");
                    int amount = sc.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;

                case 'C' :
                    System.out.println("============================================");
                    System.out.println("Enter an amount  to withdraw");
                    System.out.println("============================================");
                    int amount2 =sc.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;

                case 'D' :
                    System.out.println("============================================");
                    getPreviousTransection();
                    System.out.println("============================================");
                    System.out.println("\n");
                    break;

                case 'E':
                    System.out.println("============================================");
                    break;

                default:
                    System.out.println("Invalid option!!!. Please enter again ");
            }
        }
                  while (option != 'E');
                  System.out.println("Thank you for using our service");
    }
}
