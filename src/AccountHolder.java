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
    }

    public void addAccount(BankAccount account)
    {
        accounts.add(account);
    }

    public String getAccountInfo()
    {
        return "";
    }

    public void updateAccountInfo()
    {

    }



}
