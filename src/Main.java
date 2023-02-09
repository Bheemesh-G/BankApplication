import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      /*  System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your address");
        String address = sc.nextLine();
        System.out.println("Enter amount to be deposited...");
        int amount = sc.nextInt();
        System.out.println("Enter the Password to set your Account....");
        String password = sc.next(); */

        SBIAccount s = new SBIAccount("Bheemesh","ieeja",2000,"Bheemesh");
        System.out.println(s.getName());
        System.out.println(s.getAccountnumber());
        System.out.println(s.getAddress());
        System.out.println(s.checkBalance());


    }
}