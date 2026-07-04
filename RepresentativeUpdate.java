import java.util.Scanner;

class RepresentativeUpdate {

    void updateStatus(Parcel p) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Tracking ID:");
        String id = sc.nextLine();

        if(p.trackingID.equals(id)) {

            System.out.println("Enter Status:");
            p.status = sc.nextLine();
            System.out.println("Status Updated");

            System.out.println("Enter location staus");
            p.location = sc.nextLine();
            System.out.println("Location updated");
        }
        else {

            System.out.println("Wrong Tracking ID");
        }
    }
}
