import java.util.Scanner;

public class Register {

    static Long phonenumber;
    static String password;
    static Scanner sc = new Scanner(System.in);

    public void reg() {

        System.out.println("Welcome please register your account");

        System.out.println("Enter phone number: ");
        phonenumber = sc.nextLong();
        sc.nextLine();

        System.out.println("Enter your password: ");
        password = sc.nextLine();

        System.out.println("Successfully registered please login your account");
    }

    public void log() {

        System.out.println("Enter phone number: ");
        Long p = sc.nextLong();
        sc.nextLine();

        System.out.println("Enter your password: ");
        String hh = sc.nextLine();

        if ((phonenumber.equals(p)) && password.equals(hh)) {
            System.out.println("Successfully logged in");
            System.out.println("Welcome to the logistics package booker proceed your Booking");
        } else {
            System.out.println("Unsuccessful recognition");
        }
    }

    public static void main(String[] args) {

        Register ob = new Register();
        MainSystem obj1 = new MainSystem();

        ob.reg();
        ob.log();
        obj1.data();
    }
}