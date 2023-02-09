import java.util.Scanner;
import java.util.UUID;

public class HDFCAccount implements Bank{
    Scanner sc = new Scanner(System.in);

    private String name;
    private String accountnumber;
    private String address;
    private int amount;
    private String password;
    private double interest;

    public HDFCAccount(String name,String address,int amount,String password) {
        this.name = name;
        this.address = address;
        this.amount = amount;
        this.accountnumber = String.valueOf(UUID.randomUUID());
        this.password = password;
        this.interest = 7.66;
    }

    public double getInterest() {
        return interest;
    }

    public String getName() {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

   /* public int getAmount() {
        return amount;
    } */

    public void setAmount(int amount) {
        this.amount = amount;
    }

  /*  public String getPassword() {
        return password;
    }  */

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String checkBalance() {
        return "Avalible Balance is "+ this.amount;
    }

    @Override
    public String addBalance() {
        System.out.println("Enter password...");
        String pin = sc.next();
        boolean a = equals(pin,password);
        if(a == true)
        {
            System.out.println("Enter amount to add into Your Account.....");
            int money = sc.nextInt();
            amount+=money;
            return "Your amount "+money+" added Successfully....";
        }

        return "You entered wrong password...";
    }

    @Override
    public double rateOfInterest(int time) {
        return (amount*time*6.66)/100;
    }

    // boolean ans = false;

    public boolean equals(String pin,String password)
    {
        if(pin.equals(this.password))
        {
            return true;
        }
        return false;
    }

    @Override
    public String withDraw() {
        System.out.println("Enter Amount to Withdraw.....");
        int money = sc.nextInt();
        System.out.println("Enter your password....");
        int count =1;
        String pin = sc.next();
        boolean var = equals(pin,password);
        if(var == true)
        {
            if(this.amount>=money)
            {
                amount-=money;

                return "Amount Withdraw "+money+" Successfull....";
            }
            else if(money>amount)
            {
                return "Insufficient Balance...";
            }
        }
        while(count<=5)
        {
            count++;
            System.out.println("You entered worng password...");
            System.out.println("enter correct password....");
            pin = sc.next();
            boolean a = equals(pin,password);
            if(a == true)
            {
                if(this.amount>=money)
                {
                    amount-=money;

                    return "Amount Withdraw "+money+" Successfull....";
                }
                else if(money>amount)
                {
                    return "Insufficient Balance...";
                }
            }

        }

        return "You forgot your password....";

    }
}
