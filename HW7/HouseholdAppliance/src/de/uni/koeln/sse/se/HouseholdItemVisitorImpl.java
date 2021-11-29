package de.uni.koeln.sse.se;

public class HouseholdItemVisitorImpl implements HouseholdItemVisitor{

	@Override
	public double visit(Electronic electronic) {
		// TODO Auto-generated method stub
		double cost;
		
		if (electronic.getFragile()) {
			cost = (electronic.getWeight() / 10.0) *5.0; 
		
		} else {
			cost = (electronic.getWeight() / 15.0) *5.0;
		}
		
		System.out.println(electronic.getName() + ":");
		System.out.println("Total Cost for " + electronic.getName() + " is " + cost +" Euros");
		System.out.println(" >shoul be covered with Ployethlene foam film and packed in a box with dimension: " 
				+ (electronic.getLength() + 1) +  "x" + (electronic.getWidth() + 1) + "x" + (electronic.getHeight() + 1));
		System.out.println("----------------------------------------------------------------------------" + "\n");
		return cost;
	}

	@Override
	public double visit(Furniture furniture) {
		// TODO Auto-generated method stub
		double unit = (furniture.getWeight() / 20.0) ;
		double cost = unit * 5.0;

		System.out.println(furniture.getName() + ":");
		System.out.println("Total Cost for " + furniture.getName() + " is " + cost +" Euros");
		System.out.println(" >shoul be covered with waterproof covers with area of: " 
				+ furniture.getLength() + "x" + furniture.getWidth());
		System.out.println("----------------------------------------------------------------------------" + "\n");
		return cost;
	}

	@Override
	public double visit(Glass glass) {
		// TODO Auto-generated method stub
		double cost =0.0;
		if (glass.getTickness() == 1) {
			cost = 2.0 * (glass.getLength()/100.0);
			
		} else if (glass.getTickness() == 2) {
			cost = 1.2 * (glass.getLength()/100.0);
			
		} else if (glass.getTickness() == 3) {
			cost = 0.7 * (glass.getLength()/100.0);
			
		}
		
		System.out.println(glass.getName() + ":");
		System.out.println("Total Cost for " + glass.getName() + " is " + cost +" Euros");
		System.out.println(" >shoul be warapped with Bubble Wraps and packed in a box with dimension: " 
				+ (glass.getLength() + 1) + "x" + (glass.getWidth() + 1) + "x" + (glass.getHeight() + 1));
		System.out.println("----------------------------------------------------------------------------" + "\n");
		return cost;
	}

}
