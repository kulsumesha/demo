package plants;

public class Vegetable extends Plant {
    private String shelfLife;

    public Vegetable() {
        super();
        System.out.println("E-Vegetable");
    }

    public Vegetable(String id, String name, String type, double price, String shelfLife) {
        super(id, name, type, price);
        System.out.println("P-Vegetable");
        setShelfLife(shelfLife);
    }

    public Vegetable(String id, String name, String type, double price, double quantity, String shelfLife) {
        super(id, name, type, price, quantity);
        System.out.println("P-Vegetable");
        setShelfLife(shelfLife);
    }

    public void setShelfLife(String shelfLife) {
        this.shelfLife = shelfLife;
    }

    public String getShelfLife() {
        return shelfLife;
    }

    @Override
    public void displayDetails() {
        System.out.println("Id: " + super.getId());
        System.out.println("Name: " + super.getName());
        System.out.println("Price: " + super.getPrice());
        System.out.println("Vegetable Shelf Life: " + shelfLife);
        System.out.println("Quantity: " + super.getQuantity());
        System.out.println("............................");
    }

    @Override
    public String toString() {
        String data = "";
        data += "Id: " + super.getId() + "\n";
        data += "Name: " + super.getName() + "\n";
        data += "Price: " + super.getPrice() + "\n";
        data += "Vegetable Shelf Life: " + shelfLife + "\n";
        data += "Quantity: " + super.getQuantity() + "\n";
        data += "............................" + "\n";
        return data;
    }
}
