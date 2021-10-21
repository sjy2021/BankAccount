import java.util.ArrayList;

public class AccountHolder
{
    private String firstName;

    private String lastName;

    private String street;

    private String city;

    private String state;

    private int zip;

    private ArrayList<BankAccount> accounts;

    public AccountHolder(String firstName, String lastName, String street,
                         String city, String state, int zip)
    {
        this.firstName = firstName;
        this.lastName =lastName;
        this.street =street;
        this.city =city;
        this. state =state;
        this.zip = zip;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account)
    {
        accounts.add(account);
    }

    public String getAccountInfo()
    {
        // return all bank holder info plus account numnber
        return "";
    }

    public String getName()
    {
        return firstName + " " +lastName;
    }

    public void updateAccountInfo()
    {
        // able to update all info
    }



}
