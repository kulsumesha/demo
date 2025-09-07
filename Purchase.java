package checkout;
import plants.*;
public class Purchase{
	private PurchaseItem[] purchaseItems;
	public Purchase(){
		purchaseItems = new purchaseItem[1000];
	}
	public Purchase(int size){
		purchaseItems = new PurchaseItem[size];
	}
	public void addPlant(int plantNo, Plant p,double quantity){
		if(plantNo>=0 && plantNo<purchaseItems.length && p.getQuantity()>= quantity){
			purchaseItems[plantNo] = new PurchaseItem(p,quantity);
		}
		else{
			p.displayDetails();
			System.out.println("Out of Stock for Quantity : "+ quantity);
		}
	}
	
	public PurchaseItem getProduct(int plantNo){
		return purchaseItems[plantNo];
	}
	
	// public Product getProductById(String id){
		// for(Product p : products){
			// if(p!=null){
				// if(p.getId().equals(id)){
					// return p;
				// }
			// }
		// }
		// return null;
	// }
	
	public void remove(int itemNo){
		cartItems[itemNo] = null;
	}
	
	public void showCart(){
		System.out.println("------------ Cart Details --------------");
		double totalCost = 0;
		for(CartItem item : cartItems){
			if(item!=null){
				totalCost += item.getBill();
				item.showItem();
			}
		}
		System.out.println("-------------------------------------------");
		System.out.println("# Total Bill: "+totalCost);
		System.out.println("-------------------------------------------");
	
	}
	
	public void confirmOrder(){
		showCart();
		for(CartItem item : cartItems){
			if(item!=null){
				item.sellProduct();
			}
		}
	}
}