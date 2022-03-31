package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
	
	HashMap<Furniture,Integer> order = new HashMap<>();
	
    FurnitureOrder() {
        // TODO: Complete the constructor
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method
		if (type != null) {
			if (order.get(type) == null) {
				order.put(type, furnitureCount);
			} else {
				order.put(type, order.get(type) + 1);
			}
		}
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
    	return order;
    }

    public float getTotalOrderCost() {
        // TODO: Complete the method
    	float totalCost = 0f;
    	if(!order.isEmpty()) {
    		for(Map.Entry<Furniture, Integer> e:order.entrySet()) {
    			totalCost= totalCost + (e.getKey().cost()*e.getValue());
    		}
    	}
        return totalCost;
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
    	if(type!=null && order.get(type)!=null) {
    		return order.get(type);
    	}
        return -1;
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
    	if(type!=null) {
    		return type.cost();
    	}
        return -1.0f;
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
    	int orderQuantity=-1;
    	if(!order.isEmpty()) {
    		for(Map.Entry<Furniture, Integer> e:order.entrySet()) {
    			orderQuantity+= e.getValue();
    		}
    	}
        return orderQuantity;
    }
}
