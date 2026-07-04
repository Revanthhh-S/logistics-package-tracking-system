import java.util.Scanner;

public class MainSystem {
    void data(){
        Scanner sc = new Scanner(System.in);
        CustomerBooking c = new CustomerBooking();
        RepresentativeUpdate r = new RepresentativeUpdate();
        CustomerTracking t = new CustomerTracking();
        
        Parcel parcel = null;
        while(true) {
            System.out.println("\n1 Book Parcel");
            System.out.println("2 Update Parcel Status");
            System.out.println("3 Track Parcel");
            System.out.println("4 Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            if(choice == 1) {
                parcel = c.bookParcel();

            } 


                else if(choice == 2) {

                if(parcel != null)
                    r.updateStatus(parcel);
                else
                    System.out.println("No Parcel Booked");

            }

            else if(choice == 3) {

                if(parcel != null)
                    t.track(parcel);
                else
                    System.out.println("No Parcel Booked");

            }

            else if(choice == 4) {

                break;
            }
        }
    }
    public static void main(String args[]) {
        MainSystem ob= new MainSystem();
        ob.data();
    }
}