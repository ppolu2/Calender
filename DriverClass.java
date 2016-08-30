
public class DriverClass {
	public static void main(String args[])
	{
		Date date1= new Date(2016,8,05);
		Date date2= new Date(2016, 8, 04);
		System.out.println(date1.toString());
		System.out.println(date2.toString());
		System.out.println(date1.equals(date2));
		System.out.println(date1.compareTo(date2));
	}

}
