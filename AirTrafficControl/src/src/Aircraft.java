package src;

interface Aircraft {
	String getID();
	String getCountry();
	SIZE getSize();
	boolean land(Runway runway);
}
