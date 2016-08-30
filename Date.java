
public class Date implements Comparable<Date>{
	private int year;
	private int month;
	private int day;
	public Date(int year, int month, int day) throws IllegalArgumentException
	{
		this.year=year;
		this.month=month;
		this.day=day;
		try{
		if(year<2014||year>2020)
		{
			throw new IllegalArgumentException("year is not in the specified range of 2014-2020");
		}
		if(month<1||month>12)
		{
			throw new IllegalArgumentException("month is not between 4-12");
		}
		if(day<1||day>31)
		{
			throw new IllegalArgumentException("Day is not between 1-31");
		}
		}
		catch(IllegalArgumentException iae)
		{
			System.out.println(iae.getMessage());
		}
		
	}
	public int getYear()
	{
		return year;
	}
	public int getMonth()
	{
		return month;
	}
	public int getDay()
	{
		return day;
	}
	public String toString()
	{
		return month+"/"+day+"/"+year;
		
	}
	public boolean equals(Object obj)
	{
		boolean return_value;
		return_value=false;
		Date otherDate= (Date)obj;
		if(this.day==otherDate.day && this.month==otherDate.month && this.year== otherDate.year)
		 return_value=true;
		else 
			return_value=false;
		return return_value;
		
	}
	public int compareTo(Date otherDate)
	{
		int value=0;
		if(this.year==otherDate.year)
		{
			if(this.month==otherDate.month)
			{
				if(this.day==otherDate.day)
				{
					System.out.println("Dates cant be the same.");
				}
				else if(this.day>otherDate.day)
					value=1;
				else
					value=-1;
			}
			else if(this.month>otherDate.month)
				value=1;
			else
				value=-1;
		}
		else if(this.year>otherDate.year)
			value=1;
		else
			value=-1;
		return value;
		
	}
	
}
