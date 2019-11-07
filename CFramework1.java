import java.util.*;
public class CFramework1
{
	public static void main(String args[])
	{
		ArrayList l1 = new ArrayList(4);
		l1.add("Hary");
		l1.add("Tom");
		l1.add(1,"Nick");
		
		Iterator it = l1.iterator();
		while(it.hasNext());
		{
			System.out.println(it.next());
		}
	}
}
