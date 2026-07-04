import java.util.Scanner;

class CustomerBooking {

    Parcel bookParcel() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Sender Name:");
        String sender = sc.nextLine();

        System.out.println("Enter Receiver Name:");
        String receiver = sc.nextLine();

        System.out.println("Enter Address:");
        String address = sc.nextLine();

        String id = "BOB" + (int)(Math.random()*10000);
        Parcel p = new Parcel(id, sender, receiver, address);

        System.out.println("Parcel Booked");
        System.out.println("Tracking ID: " + id);

        return p;
    }
}