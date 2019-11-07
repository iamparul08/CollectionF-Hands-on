import java.util.*;
class CFramework2
{
	public static void main(String[] args)
	{
		LinkedList l = new LinkedList();
		l.addFirst("Parul");
		l.add(1,"Student");
		l.addLast("Mathur");
		
		System.out.println(l.getFirst());
		System.out.println(l.get(1));
		System.out.println(l.getLast());
	}
}