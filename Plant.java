package plants;
public abstract class Plant{
	private String id;
	private String name;
	private String type;
	private double price;
	private double quantity=100;
	
	public Plant(){
		System.out.println("E-Plant");
	}
	
	public Plant(String id,String name,String type,double price){
		System.out.println("P-Plant");
		setId(id);
		setName(name);
		setType(type);
		setPrice(price);
	} 
	
	public Plant(String id,String name,String type,double price,double quantity){
		System.out.println("P-Plant");
		setId(id);
		setName(name);
		setType(type);
		setPrice(price);
		setQuantity(quantity);
	}
	
	public void setId(String id){
		if(id.length() >=2 ){
			this.id = id;
		}
		else{
			System.out.println("Invalid Plant Id");
		}
	}
	public String getId(){
		return id;
	}
	
	public void setName(String name){
		if(!name.isEmpty()){
			this.name = name;
		}
		else{
			System.out.println("Invalid Plant Name");
		}
	}
	public String getName(){
		return name;}
		
		public void setType(String type) {
    if(type.equals("Flower") || type.equals("Fruit") || type.equals("Vegetable") ||
       type.equals("Herbal") || type.equals("Cactus")) {
        this.type = type;
    } else {
        System.out.println("Invalid type! Must be one of the 5 types.");
    }
}
	public String getType(){
		return type;}
	
	public void setPrice(double price){
		if(price>=0){
			this.price = price;
		}
		else{
			System.out.println("Invalid Price");
		}
	}
	public double getPrice(){
		return price;
	}
	
	public void setQuantity(double quantity){
		if(quantity>=0){			
			this.quantity = quantity;
		}
	}
	public double getQuantity(){
		return quantity;
	}
	
	public void addQuantity(double quantity){
		this.quantity += quantity;
	}
	public void sellQuantity(double quantity){
		if(quantity<= this.quantity){
			this.quantity -= quantity;
		}
	}
	
	public abstract void displayDetails();
	public abstract String toString();
	
	// public void displayDetails(double vat){
		// System.out.println(".....................");
		// System.out.println("Product Id: "+id);
		// System.out.println("Product Name: "+name);
		// System.out.println("Product Price: "+price);
		// System.out.println("Product Price With Vat: "+(price+price*vat));
	// }
	
}
