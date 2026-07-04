import java.util.Scanner;

class CustomerTracking {

    void track(Parcel p) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Tracking ID:");
        String id = sc.nextLine();

        if(p.trackingID.equals(id)) {

            System.out.println("Sender: " + p.sender);
            System.out.println("Receiver: " + p.receiver);
            System.out.println("Address: " + p.address);
            System.out.println("Status: " + p.status);
            System.out.println("location: " + p.location);  
            
        }
        else {

            System.out.println("Wrong Tracking ID");
        }
    }
}