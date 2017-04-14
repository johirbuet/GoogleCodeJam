import java.util.TreeSet;

public class NotCodeJamTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> tset =new TreeSet<>();
		
		tset.add("Johir");
		tset.add("Alimuddin");
		tset.add("Arif");
		tset.add("Kabir");
		tset.add("Sifat");
		tset.add("Johir");
		// Stored in sorted order
		for (String string : tset) {
			System.out.println(string);
		}
	}

}
