package plants;

public class Cactus extends Plant {
    private boolean hasFlowers;
    private String climate;

    public Cactus() {
        super();
        System.out.println("E-Cactus");
    }

    public Cactus(String id, String name, String type, double price, boolean hasFlowers, String climate) {
        super(id, name, type, price);
        System.out.println("P-Cactus");
        setHasFlowers(hasFlowers);
        setClimate(climate);
    }

    public Cactus(String id, String name, String type, double price, double quantity, boolean hasFlowers, String climate) {
        super(id, name, type, price, quantity);
        System.out.println("P-Cactus");
        setHasFlowers(hasFlowers);
        setClimate(climate);
    }

    public void setHasFlowers(boolean hasFlowers) {
        this.hasFlowers = hasFlowers;
    }

    public boolean getHasFlowers() {
        return hasFlowers;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getClimate() {
        return climate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Id: " + super.getId());
        System.out.println("Name: " + super.getName());
        System.out.println("Price: " + super.getPrice());
        System.out.println("Has Flowers: " + (hasFlowers ? "Yes" : "No"));
        System.out.println("Climate: " + climate);
        System.out.println("Quantity: " + super.getQuantity());
        System.out.println("............................");
    }

    @Override
    public String toString() {
        String data = "";
        data += "Id: " + super.getId() + "\n";
        data += "Name: " + super.getName() + "\n";
        data += "Price: " + super.getPrice() + "\n";
        data += "Has Flowers: " + (hasFlowers ? "Yes" : "No") + "\n";
        data += "Climate: " + climate + "\n";
        data += "Quantity: " + super.getQuantity() + "\n";
        data += "............................" + "\n";
        return data;
    }
}
