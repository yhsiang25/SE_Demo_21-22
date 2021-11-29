package de.uni.koeln.sse.se;

public interface HouseholdItemVisitor {
	
	double visit(Electronic electronic);
	double visit(Furniture furniture);
	double visit(Glass glass);

}
