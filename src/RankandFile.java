import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class RankandFile {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc =new Scanner(new File("B-large-practice.in"));
		PrintStream ps =new PrintStream(new File("output.txt"));
		System.setOut(ps);
		int T= sc.nextInt();
		
		for(int i=1;i<=T;i++)
		{
			TreeMap<Integer, Integer> tm = new TreeMap<>();
			int n = sc.nextInt();
			
			for(int j=0;j<(2*n-1)*n;j++)
			{
				int t =sc.nextInt();
				if(tm.containsKey(t))
				{
					tm.put(t, tm.get(t)+1);
				}
				else
				{
					tm.put(t, 1);
				}
			}
			Set<Entry<Integer, Integer>> set = tm.entrySet();
			Iterator it = set.iterator();
			ArrayList<Integer> list =new ArrayList<>();
			while(it.hasNext())
			{
				Map.Entry em =(Map.Entry)it.next();
				int key = (int) em.getKey();
				int value = (int) em.getValue();
				if(value%2 ==1)
				{
					list.add(key);
				}
			}
			System.out.print("Case #"+i+": ");
			for (Integer integer : list) {
				System.out.print(integer+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
