import java.util.ArrayList;
import java.util.List;


public class ForEachMethodJava8 {

	public static void main(String[] args) {
		
		List<String> gameslist=new ArrayList<String>();
		gameslist.add("CRICKET");
		gameslist.add("TENISH");
		gameslist.add("FOOOTBALL");
		gameslist.add("HOCKY");
		gameslist.add("TABLE TENIS");
		gameslist.add("KABBADI");		
		 System.out.println("------------Iterating by passing method reference---------------");  
		gameslist.forEach(System.out::println);
		  System.out.println("------------Iterating by passing lambda expression--------------"); 
		  gameslist.forEach(ForEachMethodJava8 -> System.out.println(ForEachMethodJava8));
		  
		  System.out.println("Java Stream forEachOrdered() Method---Iterating by passing method reference-");  
		  gameslist.stream().forEachOrdered(System.out::println);  
	}

}
