package plants;

public class Herbal extends Plant {
    private String medicineUse;

    public Herbal() {
        super();
        System.out.println("E-Herbal");
    }

    public Herbal(String id, String name, String type, double price, String medicineUse) {
        super(id, name, type, price);
        System.out.println("P-Herbal");
        setMedicineUse(medicineUse);
    }

    public Herbal(String id, String name, String type, double price, double quantity, String medicineUse) {
        super(id, name, type, price, quantity);
        System.out.println("P-Herbal");
        setMedicineUse(medicineUse);
    }

    public void setMedicineUse(String medicineUse) {
        this.medicineUse = medicineUse;
    }

    public String getMedicineUse() {
        return medicineUse;
    }

    @Override
    public void displayDetails() {
        System.out.println("Id: " + super.getId());
        System.out.println("Name: " + super.getName());
        System.out.println("Price: " + super.getPrice());
        System.out.println("Herbal Medicine Use: " + medicineUse);
        System.out.println("Quantity: " + super.getQuantity());
        System.out.println("............................");
    }

    @Override
    public String toString() {
        String data = "";
        data += "Id: " + super.getId() + "\n";
        data += "Name: " + super.getName() + "\n";
        data += "Price: " + super.getPrice() + "\n";
        data += "Herbal Medicine Use: " + medicineUse + "\n";
        data += "Quantity: " + super.getQuantity() + "\n";
        data += "............................" + "\n";
        return data;
    }
}
