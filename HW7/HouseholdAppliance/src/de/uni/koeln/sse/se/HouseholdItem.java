package de.uni.koeln.sse.se;

public interface HouseholdItem {
	public void accept (HouseholdItemVisitor visitor);
}
