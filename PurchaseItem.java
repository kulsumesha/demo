package checkout;
import plants.*;
public class Purchaseitem{
	private Plant plant;
	private double quantity;
	
	public PurchaseItem(Plant plant, double quantity){
		setPlant(plant);
		setQuantity(quantity);
	}
	public void setPlant(Plant plant){
		this.plant = plant;
	}
	public Plant getPlant(){
		return plant;
	}
	
	public void setQuantity(double quantity){
		if(quantity>0){
			this.quantity = quantity;
		}
	}
	
	public double getQuantity(){
		return quantity;
	}
	
	public double getReceipt(){
		return plant.getPrice()*quantity;
	}
	public void sellPlant(){
		plant.sellQuantity(quantity);
	}
	public void showPlant(){
		System.out.println(plant.getId()+" | "+plant.getName()+" | "+plant.getPrice()+" | "+ quantity+ " | "+ getReceipt() );
	}
}
