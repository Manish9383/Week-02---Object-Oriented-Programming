class Item{
    int itemCode;
    String itemName;
    double Price;
    Item(int itemCode, String itemName, double Price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.Price = Price;
    }
    void display(){
        System.out.println("Item Code: "+itemCode);
        System.out.println("Item Name: "+itemName);
        System.out.println("Price: "+Price);
    }
}
public class TrackInventory{
    public static void main(String[] args){
        Item i1 = new Item(101, "Laptop", 50000);
        i1.display();
    }
}