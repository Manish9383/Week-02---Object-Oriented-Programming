class Hotel{
    String guestName;
    String roomType;
    String nights;
    Hotel(){
        guestName = "Unknown";
        roomType = "Not Available";
        nights = "Not Available";
    }
    Hotel(String guestName, String roomType, String nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    Hotel(Hotel h){
        guestName = h.guestName;
        roomType = h.roomType;
        nights = h.nights;
    }
    void display(){
        System.out.println("Guest Name: "+guestName);
        System.out.println("Room Type: "+roomType);
        System.out.println("No. of Nights: "+nights);
    }
}
public class HotelBooking{
    public static void main(String[] args){
        Hotel h1 = new Hotel("John", "Single", "3");
        Hotel h2 = new Hotel(h1);
        Hotel h3 = new Hotel();
        h1.display();
        h2.display();
        h3.display();
    }
}