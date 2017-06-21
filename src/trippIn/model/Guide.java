package trippIn.model;

import java.util.ArrayList;
import java.util.List;

public class Guide {
	private List<EventTrip> timeline;

	public Guide() {
		super();
		timeline = new ArrayList<EventTrip>(1);
	}

	public Guide(List<EventTrip> timeline) {
		super();
		this.timeline = timeline;
	}

	public List<EventTrip> getTimeline() {
		return timeline;
	}

	public void setTimeline(List<EventTrip> timeline) {
		this.timeline = timeline;
	}
	
	public void addTrip(EventTrip event){
		if (timeline.isEmpty()) timeline.add(event);
		else{
			int i=0;
			while(timeline.get(i).getStarts().compareTo(event.getStarts()) < 0  ){
				i++;
			}
			timeline.add(i, event);
		}

	}
	
	

}
