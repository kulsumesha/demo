package plants;

public class Fruit extends Plant{
    private String season;

    public Fruit() {
        super();
        System.out.println("E-Fruit");
    }

    public Fruit(String id, String name, String type, double price, String season) {
        super(id, name, type, price);
        System.out.println("P-Fruit");
        setSeason(season);
    }
	
	public Fruit(String id, String name, String type, double price, double quantity, String season) {
        super(id, name, type, price, quantity);
        System.out.println("P-Fruit");
        setSeason(season);
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getSeason() {
        return season;
    }

    @Override
    public void displayDetails() {
        System.out.println("Id: " + super.getId());
        System.out.println("Name: " + super.getName());
        System.out.println("Price: " + super.getPrice());
        System.out.println("Fruit Season: " + season);
        System.out.println("Quantity: " + super.getQuantity());
        System.out.println("............................");
    }

    @Override
    public String toString() {
        String data = "";
        data += "Id: " + super.getId() + "\n";
        data += "Name: " + super.getName() + "\n";
        data += "Price: " + super.getPrice() + "\n";
        data += "Fruit Season: " + season + "\n";
        data += "Quantity: " + super.getQuantity() + "\n";
        data += "............................" + "\n";
        return data;
    }
}
