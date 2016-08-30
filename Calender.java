
public class Calender {
	static final int MAXEVENTS=4;
	Event[] events;
	int numEvents;
	public Calender()
	{
		events= new Event[MAXEVENTS];
		numEvents=0;
	}
	Boolean addEvent(Event e)
	{
		if (numEvents!=MAXEVENTS)
		{
			events[numEvents]=e;
			numEvents+=1;
			return true;
		}
		else
		{
			System.out.println("Raeches maximum limit. Cannot add more elements.");
			return false;
		}
	}
	@SuppressWarnings("unused")
	int FindEvent(Event e)
	{
		for(int i=0; i<numEvents; i++)
		{
			if(events[i]==e)
			{
				return i;
			}
			else 
			{
				return -1;
			}
			
		}
		return -1;
	}
	void dump()
	{
		for(Event e: events)
		{
			System.out.println(e);
		}
	}

}
