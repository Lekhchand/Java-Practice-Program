import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticProgram {
	public static void main(String[] args) {
List<Integer> lst= Arrays.asList(1,2,2,3,4,6,4,5); //output {1=1, 2=2, 3=1, 4=2, 5=1, 6=1} 
 Map<Integer,Long>  map= lst.stream().collect(Collectors.toMap(Function.identity(),n->1L,Long::sum));
 System.out.println( map);  
 Map<Integer, Long> frequencyMap = lst.stream().
		 collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));		 
System.out.println(frequencyMap);
frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));;
 
 int sum = lst.stream().mapToInt(Integer::intValue).sum();  // Sum all integers
System.out.println("Sum: " + sum);

Map<String,String> addprog=new HashMap<>();
addprog.put("A", "Angular"); addprog.put("C", "C++");addprog.put("J", "Java");
addprog.put("S", "Spring");addprog.put("A", "Spring");
 for(Map.Entry<String, String> set:addprog.entrySet()){	 
	 System.out.println(set.getKey() +" = " +set.getValue()); }
	 addprog.forEach((key,value)->System.out.println(value + " "+key));;		

 String words[]={"Hello","Java","Program",}; 
 Map <String,Integer> map2=new HashMap<>(); 
 for(String word:words)
	 if(map2.containsKey(word)){
		 map2.put(word, map2.get(word)+1);
	 }
	 else{map2.put(word, 1);}
System.out.println( map2);

 Map<String,Long> mapfre=Arrays.stream(words).collect(Collectors.groupingBy(Function.identity(),
		 Collectors.counting()));
	}
}
