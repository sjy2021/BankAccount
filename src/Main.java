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

        writeGreeting();

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

        // write a greeting

        mainMenu();
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
                    BankAccount newAccount = new BankAccount(initialDeposit);
                    //Needs to be Checking Account
                    //Overload BankAccount Superclass method in Checking Class
                }
                else {
                    BankAccount newAccount = new BankAccount();
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

            else if (selection == 2) { //Saving Account
                System.out.println("Do you have an inital deposit? Y/N");
                entry = in2.nextLine();
                if(entry.toLowerCase().equals("y")) {
                    System.out.println("Please enter the amount you would like to deposit: ");
                    initialDeposit = in3.nextDouble();
                    BankAccount newAccount = new BankAccount(initialDeposit); //Needs to be Savings Account
                }
                else {
                    BankAccount newAccount = new BankAccount();	//Needs to be Savings Account
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
                    BankAccount newAccount = new BankAccount(initialDeposit); //Needs to be Checking Account
                }
                else {
                    BankAccount newAccount = new BankAccount();
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

        // data structure for account holder
    }

    private static void createDefaultAccounts(ArrayList<AccountHolder> holders)
    {
        AccountHolder holder1 = new AccountHolder("John", "Smith", "100 North Ave", "Rio Rancho", "NM", 87124);
        BankAccount ira = new IRA("10/01/1990", 50000, 1000, holder1.getName());
        holder1.addAccount(ira);
        holders.add(holder1);
    }

    private static void writeGreeting()
    {
        System.out.println("Welcome to the Java Bank! " +
                "\nPlease select (1) to create a new account or press (2) to access your account.");
    }
}
