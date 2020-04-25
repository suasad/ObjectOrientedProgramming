import java.util.List;

public class Catalogue {
	List<EventPlace> alleventPlace;
	List<Event> allEvents;
	
	List<Event> Search(Search searchMethod) {
		return searchMethod.getResult(this);
	}
}
