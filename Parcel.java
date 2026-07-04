class Parcel {

    String trackingID;
    String sender;
    String receiver;
    String address;
    String location;
    String status;
 

    Parcel(String id, String s, String r, String a) {
        trackingID = id;
        sender = s;
        receiver = r;
        address = a;
        location = " ";
        status = " ";

    }
}