package plants;
public class Flower extends Plant{
	private String color;
	private String bloomSeason;
	public Flower(){
		super();
		System.out.println("E-Flower");
	}
	public Flower(String id, String name, String type, double price, String color, String bloomSeason){
	super(id,name,"Flower",price);
	System.out.println("P-Flower");
	setColor(color);
	setBloomSeason(bloomSeason);
}

public Flower(String id, String name, String type, double price, double quantity, String color, String bloomSeason){
	super(id,name,"Flower",price,quantity);
	System.out.println("P-Flower");
	setColor(color);
	setBloomSeason(bloomSeason);
}

public void setColor(String color){
		this.color = color;
	}
	public String getColor(){return color;}
	
	public void setBloomSeason(String bloomSeason){
		this.bloomSeason = bloomSeason;
	}
	public String getBloomSeason(){
		return bloomSeason;
	}
	@Override
	public void displayDetails(){
		System.out.println("Id: "+super.getId());
		System.out.println("Name: "+super.getName());
		System.out.println("Price: "+super.getPrice());
		System.out.println("Flower Color: "+color);
		System.out.println("Flower Blooming Season: "+bloomSeason);
		System.out.println("Quantity : "+super.getQuantity());
		System.out.println("............................");
	}
		@Override
		public String toString(){
			String data = "";
		data+= "Id: "+super.getId()+"\n";
		data+= "Name: "+super.getName()+"\n";
		data+= "Price: "+super.getPrice()+"\n";
		data+= "Flower Color: "+color+"\n";
		data+= "Flower Blooming Season: "+bloomSeason+"\n";
		data+= "Quantity : "+super.getQuantity()+"\n";
		data+= "............................"+"\n";
		
		return data;
	}
}
	