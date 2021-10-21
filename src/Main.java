import java.util.ArrayList;
import java.util.*;

public class Main {

    public static void mainMenu() {
        String [] menu = new String[4];
        // data structure for account holder
        ArrayList<AccountHolder> accountHolders = new ArrayList<>();

        // create a method that will create 3 default bank account classes
        createDefaultAccounts(accountHolders);
        // write a greeting

        //writeGreeting();

        menu[0] = "1. Checking Account";
        menu[1] = "2. Savings Account";
        menu[2] = "3. IRA Account";
        menu[3] = "0. To Quit";

        System.out.println("What type of account would you like to open?");
        for(String menuList : menu) {
            System.out.println(menuList);
        }
    }

    public static void main(String[] args) {
        String [] menu = new String[4];

        // data structure for account holder
        ArrayList<AccountHolder> accountHolders = new ArrayList<>();

        // create a method that will create 3 default bank account classes
        createDefaultAccounts(accountHolders);
        // write a greeting
        writeGreeting();

        //Instantiate Scanner objects
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        Scanner in3 = new Scanner(System.in);

        //Variables
        int selection;
        Boolean sentinel = true;
        double initialDeposit;
        String entry;

        //mainMenu();
        // give user option to get account or make an account
        System.out.println("Please enter a number from the menu above.");

        //Quits the program if 0 is entered.
        while (sentinel == true) {
            selection = in.nextInt();
            if (selection == 1) { //Checking Account
                System.out.println("Do you have an inital deposit? Y/N");
                entry = in2.nextLine();
                if(entry.toLowerCase().equals("y")) {
                    System.out.println("Please enter the amount you would like to deposit: ");
                    initialDeposit = in3.nextDouble();
                    BankAccount newCheckingAccount = new Checking(initialDeposit);
                    System.out.println();
                }
                else {
                    //BankAccount newAccount = new BankAccount();
                    BankAccount newCheckingAccount = new Checking();
                    newCheckingAccount.toString();
                }

                System.out.println("Would you like to open another account? Y/N.");
                entry = in2.nextLine();
                if(entry.toLowerCase().equals("y")) {
                    mainMenu(); //Print default prompt to use
                }
                writeGreeting();
                // else {
                //     sentinel = false;
                //     System.out.println();
                // }
            }
            else if (selection == 2) { //Saving Account
                System.out.println("Do you have an inital deposit? Y/N");
                entry = in2.nextLine();
                if(entry.toLowerCase().equals("y")) {
                    System.out.println("Please enter the amount you would like to deposit: ");
                    initialDeposit = in3.nextDouble();
                    //BankAccount newAccount = new BankAccount(initialDeposit); //Needs to be Savings Account
                }
                else {
                    //BankAccount newAccount = new BankAccount();	//Needs to be Savings Account
                }
                System.out.println("Would you like to open another account? Y/N.");
                entry = in2.nextLine();
                if(entry.toLowerCase().equals("y")) {
                    mainMenu(); //Print default prompt to use
                }
                else {
                    sentinel = false;
                    System.out.println();
                }
            }

            else if (selection == 3) { //IRA Account
                System.out.println("Do you have an inital deposit? Y/N");
                entry = in2.nextLine();
                if(entry.toLowerCase().equals("y")) {
                    System.out.println("Please enter the amount you would like to deposit: ");
                    initialDeposit = in3.nextDouble();
                   // BankAccount newAccount = new BankAccount(initialDeposit); //Needs to be Checking Account
                }
                else {
                    //BankAccount newAccount = new BankAccount();
                }
                System.out.println("Would you like to open another account? Y/N.");
                entry = in2.nextLine();
                if(entry.toLowerCase().equals("y")) {
                    mainMenu(); //Print default prompt to use
                }                
                else {
                    sentinel = false;
                    System.out.println();
                }
            }

            else if (selection == 0) { //Quit the program
                sentinel = false;
                System.out.println();
            }

            else {
                System.out.println("Invalid selection. Please enter a number from the menu above.");
                //mainMenu();
            }
        }
        in.close();
        in2.close();
        in3.close();

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

    private static void writeGreeting()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Java Bank! " +
                "\nPlease select (1) to create a new account or press (2) to access your account.");
        int option = in.nextInt();
        if (option == 1) {
            mainMenu();
        }
        else if (option == 2) {
            //Grab the Account Holder Update Methods Here
        }
        else {
            System.out.println("Invalid selection. Please make valid selection.");
            writeGreeting();
        }      
    }
}
