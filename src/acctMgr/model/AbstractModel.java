package acctMgr.model;
import java.util.List;
import java.util.ArrayList;

public abstract class AbstractModel implements Model {
	
	private List<ModelListener> listeners = new ArrayList<ModelListener>(5);
	
	
	public void notifyChanged(ModelEvent event) {
		System.out.println("AbstractModel - notifyChanged method called \n");
		for(ModelListener ml : listeners){
			ml.modelChanged(event);
		}
	}
	
	public void addModelListener(ModelListener l){
		listeners.add(l);
	}
	public void removeModelListener(ModelListener l){
		listeners.remove(l);
	}

}
