import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.stream.Collectors;

 class Employee {

	 int  empId;
	String empName;
	String empDept;
	public Employee(int empId,String empName,String empDept)
	{
		this.empId=empId;
		this.empName=empName;
		this.empDept=empDept;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empDept=" + empDept + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}	
	
}
public class StreamAPI8 {  
    public static void main(String[] args) { 
    	
    List<Employee> streamobj=new ArrayList<Employee>(); 
    streamobj.add(new Employee(123,"AJAY","SOJ"));
    streamobj.add(new Employee(124,"VIJAY","VJNT"));
    streamobj.add(new Employee(125,"RAJ","RDD"));
    streamobj.add(new Employee(126,"MAYUR","MDP"));
    streamobj.add(new Employee(127,"SACHIN","MEDD"));
    streamobj.add(new Employee(128,"Lekh","AHD"));
    ListIterator<Employee> listIterator = streamobj.listIterator(); 
    List abc=new ArrayList(); 
    //Filtering Collection without using Stream
    for(Employee example:streamobj){
    	if(example.empId>125)
    	{	
         abc.add(example.empId);
    	abc.add(example.empName);
    	abc.add(example.empDept);
    	}  
    }
    System.out.println(abc);
    System.out.println("1______________________________ ");
    //Filtering Collection without using Stream
   while(listIterator.hasNext()){   
    
	   System.out.println(listIterator.next());  
	  
    }
   System.out.println("2______________________________ ");
 
  //Filtering Collection with using Stream 
    List abc2=streamobj.stream().filter(p -> p.empId>125).map(p ->p.empId).collect(Collectors.toList()); ; 
    System.out.println(abc2);
    
    System.out.println("3______________________________ ");
    // This is more compact approach for filtering data  
    String[] emp = null;
    streamobj.stream().filter(employee -> employee.empId >= 125)
                         .forEach(employee -> System.out.println(employee.toString())); 
    
    System.out.println("4______________________________ ");
    
    // Converting Product List into a Map  
    Map<Integer,String> employeeMap =streamobj.stream()  
                    .collect(Collectors.toMap(p->p.empId,p->p.empName));  
          
    System.out.println(employeeMap);  
    }    }