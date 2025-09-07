package interfaces;
import plants.*;
public interface INurseryOperations{
	public abstract void addPlant(int pNo, Plant p);
	public abstract Plant getPlant(int pNo);
	public abstract Product getPlantById(String id);
	public abstract void remove(int pNo);
	//public abstract void removeById(String id);
}
