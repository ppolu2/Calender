
public class Event {
	Date date;
	int start;
	int end;
	String description;
	public Event(Date date, int start, int end, String description )throws IllegalArgumentException
	{
		this.date=date;
		this.start=start;
		this.end=end;
		this.description=description;
		try
		{
			if(this.start>this.end)
			{
				throw new IllegalArgumentException();
			}
		}
		catch(IllegalArgumentException iae)
		{
			System.out.println(iae.getMessage());
		}
	}
	Date getDate()
	{
		return date;
	}
	int getStart()
	{
		return start;
	}
	int getEnd()
	{
		return end;
	}
	String getDescription()
	{
		return description;
	}
	public String toString()
	{
		return date+" "+start+"-"+end+":"+description;
	}
	public boolean equals(Object obj)
	{
		boolean return_value;
		return_value=false;
		Event eventobj= (Event)obj;
		if((this.date)==(eventobj.date) && (this.start)==(eventobj.start) &&
			(this.end)==(eventobj.end) && (this.description)==(eventobj.description)) 
		return_value=true;
		else
			return_value=false;
		return return_value;
	}
}
