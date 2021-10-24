import java.util.ArrayList;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Variable for Scanner object
        int option;

        //Instantiate Scanner objects
        Scanner userInput = new Scanner(System.in); //Integer

        // data structure for account holder
        ArrayList<AccountHolder> accountHolders = new ArrayList<>();

        // create a method that will create 3 default bank account classes
        createDefaultAccounts(accountHolders);

        //Create an Array of 20 Bank Account objects
        BankAccount bankAccounts [] = new BankAccount[20];
        int numAccounts = 0;

        // write a greeting
        do {
            option = writeGreeting(userInput);
            System.out.println();
            if (option == 1) { //Create New Account
                bankAccounts[numAccounts++] = createAccount(userInput);
            }
            else if (option == 2) { //Deposit

            }
            else if (option == 3) { //Withdraw

            }
            else {
                System.out.println("Thanks for visiting Java Bank! Come again!");
            }
            System.out.println();
        } while (option != 4);

    } //End of Main Program


    private static void createDefaultAccounts(ArrayList<AccountHolder> holders)
    {
        AccountHolder holder1 = new AccountHolder("John", "Smith", "100 North Ave", "Rio Rancho", "NM", 87124);
        IRA ira = new IRA("10/01/1990", 1000, holder1.getName());
        holder1.addAccount(ira);
        holders.add(holder1);

        AccountHolder holder2 = new AccountHolder("Alan", "Turing", "", "", "",00000);
        Savings savings = new Savings(40, holder2.getName());
        holders.add(holder2);
    }

    private static int writeGreeting(Scanner userInput) {
        System.out.println("Welcome to the Java Bank!");
        System.out.println("1. Create New Account");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Quit");

        int option;
        do {
            System.out.println("Select option from menu above...");
            option = userInput.nextInt();
            userInput.nextLine();
        } while (option < 1 || option > 4);

        return option;
    }
    
    public static int mainAccountMenu(Scanner userInput) {
        System.out.println("What type of account would you like to open today?");
        System.out.println("1. Checking Account");
        System.out.println("2. Savings Account");
        System.out.println("3. IRA Account");

        int option;
        do {
            System.out.println("Select option from menu above...");
            option = userInput.nextInt();
            //userInput.nextLine();
        } while (option < 1 || option > 3);
        System.out.println();
        
        return option;   
    }

    public static int checkingAccountMenu(Scanner userInput) {
        System.out.println("What type of Checking Account would you like to open today?");
        System.out.println("1. Basic Checking Account");
        System.out.println("2. Premium Checking Account");
        System.out.println();
        System.out.println("See account differences below to guide your selection.");
        
        //Create Array list to display Different Types of Checking Accounts.
        ArrayList<String> checkingAccountInfo = new ArrayList<>();
        checkingAccountInfo.add("Basic Checking Account");
        checkingAccountInfo.add("======================");
        checkingAccountInfo.add("$300 Daily Withdrawal Limit");
        checkingAccountInfo.add("$1 Fee on all Transactions");
        checkingAccountInfo.add("");
        checkingAccountInfo.add("Premium Checking Account");
        checkingAccountInfo.add("========================");
        checkingAccountInfo.add("$500 Daily Withdrawal Limit");
        checkingAccountInfo.add("No Transaction Fees");
        checkingAccountInfo.add("*** Both Account Types have a $35 Overdraft Fee ***");
        checkingAccountInfo.add("");

        //Print Information on Checking Account
        for (int i = 0; i < checkingAccountInfo.size(); i++) {
			System.out.println(checkingAccountInfo.get(i));
		}

        int option;
        do {
            System.out.println("Select option from menu above...");
            option = userInput.nextInt();
            //userInput.nextLine();
        } while (option < 1 || option > 3);

        return option;   
    }    
   
    public static int savingsAccountMenu(Scanner userInput) {
        System.out.println("What type of Savings Account would you like to open today?");
        System.out.println("1. High Yield Savings Account");
        System.out.println("2. Certificate of Deposit (CD) Account");
/*
        System.out.println();
        System.out.println();
        System.out.println("See account differences below to guide your selection.");
        
        //Create Array list to display Different Types of Checking Accounts.
        ArrayList<String> checkingAccountInfo = new ArrayList<>();
        checkingAccountInfo.add("Basic Checking Account Info");
        checkingAccountInfo.add("$300 Daily Withdrawal Limit");
        checkingAccountInfo.add("$1 Fee on all Transactions");
        checkingAccountInfo.add("");
        checkingAccountInfo.add("Premium Checking Account Info");
        checkingAccountInfo.add("$500 Daily Withdrawal Limit");
        checkingAccountInfo.add("No Transaction Fees");
        checkingAccountInfo.add("* Both Account Types have a $35 Overdraft Fee");

        //Print Information on Checking Account
        for (int i = 0; i < checkingAccountInfo.size(); i++) {
			System.out.println(checkingAccountInfo.get(i));
		}
*/
        int option;
        do {
            System.out.println("Select option from menu above...");
            option = userInput.nextInt();
            //userInput.nextLine();
        } while (option < 1 || option > 3);

        return option;   
    }        

    public static int iraAccountMenu(Scanner userInput) {
        System.out.println("What type of IRA Account would you like to open today?");
        System.out.println("1. Traditional IRA Account");
        System.out.println("2. Roth IRA Account");
/*
        System.out.println();
        System.out.println();
        System.out.println("See account differences below to guide your selection.");
        
        //Create Array list to display Different Types of Checking Accounts.
        ArrayList<String> checkingAccountInfo = new ArrayList<>();
        checkingAccountInfo.add("Basic Checking Account Info");
        checkingAccountInfo.add("$300 Daily Withdrawal Limit");
        checkingAccountInfo.add("$1 Fee on all Transactions");
        checkingAccountInfo.add("");
        checkingAccountInfo.add("Premium Checking Account Info");
        checkingAccountInfo.add("$500 Daily Withdrawal Limit");
        checkingAccountInfo.add("No Transaction Fees");
        checkingAccountInfo.add("* Both Account Types have a $35 Overdraft Fee");

        //Print Information on Checking Account
        for (int i = 0; i < checkingAccountInfo.size(); i++) {
			System.out.println(checkingAccountInfo.get(i));
		}
*/
        int option;
        do {
            System.out.println("Select option from menu above...");
            option = userInput.nextInt();
            //userInput.nextLine();
        } while (option < 1 || option > 3);

        return option;   
    }    

    /*
    Creates the account based on what the user selects (Checking, Savings, or IRA).
    */
    public static BankAccount createAccount(Scanner userInput) {
        //Local Variables to drive how the account is created
        String entry, birthdate;
        double taxAmount;
        double initialDeposit;

        //Instaniate new Scanner objects
        Scanner in = new Scanner(System.in);

        //Instantiate Bank Account object
        BankAccount bankAccount = null;
        //Checking checkingAccount = null;
        //Savings savingsAccount = null;
        //IRA iraAccount = null;

        int option = mainAccountMenu(userInput);

        if (option == 1) {
            int suboption = checkingAccountMenu(userInput);
            if (suboption == 1) { //Basic Checking
                System.out.println ("Do you have an initial deposit? Y/N");
                entry = in.nextLine();
                if(entry.toLowerCase().equals("y")) {
                    System.out.println("Please enter the amount you would like to deposit: ");
                    initialDeposit = in.nextDouble();
                    System.out.println();
                    bankAccount = new Checking(initialDeposit);
                }
                else {
                    bankAccount = new Checking();
                }
            } else { //Premium Checking
                System.out.println ("Do you have an initial deposit? Y/N");
                entry = in.nextLine();
                if(entry.toLowerCase().equals("y")) {
                    System.out.println("Please enter the amount you would like to deposit: ");
                    initialDeposit = in.nextDouble();
                    System.out.println();
                    bankAccount = new PremiumChecking(initialDeposit);
                }
                else {
                    bankAccount = new PremiumChecking();
                }
            }
        } else if (option == 2) { //Savings Account
            //BUILD THIS OUT WHEN SAVINGS ACCOUNT HAS BEEN UPDATED
            System.out.println("Savings Account created.");
            
            
         }
         else { //IRA
            int suboption = iraAccountMenu(userInput);
            if (suboption == 1) { //Traditional
                System.out.println("Please Enter your First Name: ");
                entry = in.nextLine();
                System.out.println("Please Enter your birthdate (MM/DD/YYYY): ");
                birthdate = in.nextLine();
                System.out.println("Please Enter your Total Taxable Income: ");
                taxAmount = in.nextInt();
                //in.nextLine();
                System.out.println();
                bankAccount = new IRA(birthdate, taxAmount, entry);
                System.out.println();
            } else { //Roth
                System.out.println();
                bankAccount = new IRA();
                System.out.println();             
            }
         }
        return bankAccount; 
    }

}
