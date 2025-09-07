package chechout;
import plants.*;
import interfaces.*;

public class Nursery implements INurseryOperations{
	private Plant[] plant;
	public Nursery(){
		plant = new Plant[1000];
	}
	public Nursery(int size){
		plant = new Plant[size];
	}
	public void addPlant(int pNo, Plant p){
		if(pNo>=0 && pNo<plant.length){
			plant[pNo] = p;
		}
	}
	
	public Plant getPlant(int pNo){
		return plant[pNo];
	}
	
	public Plant getPlantById(String id){
		for(Plant p : plant){
			if(p!=null){
				if(p.getId().equals(id)){
					return p;
				}
			}
		}
		return null;
	}
	
	public void remove(int pNo){
		plant[pNo] = null;
	}
	
	public void showNursery(){
		System.out.println("------------ Nursery Details --------------");
		for(Plant p : plant){
			if(p!=null){
				p.displayDetails();
			}
		}
		System.out.println("-------------------------------------------");
	}
	
	
	public String toString(){
		String allData = "";
		
		allData+= "------------ Nursery Details --------------"+"\n";
		for(Plant p : plant){
			if(p!=null){
				allData += p.toString();
			}
		}
		allData+="-------------------------------------------"+"\n";
		
		return allData;
	}
}