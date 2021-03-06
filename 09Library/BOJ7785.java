import java.util.*;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		TreeSet<String> ts = new TreeSet<String>();
		int N = sc.nextInt();
		for(int i = 0; i < N; i++)
		{
			String name = sc.next();
			String str = sc.next();
			if(str.charAt(0) == 'e')
				ts.add(name);
			else
				ts.remove(name);
		}
		NavigableSet<String> descendingSet = ts.descendingSet();
		for(String v:descendingSet)
			System.out.println(v);
		sc.close();
	}
}