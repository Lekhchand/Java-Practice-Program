
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
  
class Product1{  
    int id;  
    String name;  
    float price;  
      
    public Product1(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
          
    public int getId() {  
        return id;  
    }  
    public String getName() {  
        return name;  
    }  
    public float getPrice() {  
        return price;  
    }  
}  
  
public class JavaStreamExample {  
  
    public static void main(String[] args) {  
          
        List<Product1> productsList = new ArrayList<Product1>();  
          
        //Adding Products  
        productsList.add(new Product1(1,"HP Laptop",25000f));  
        productsList.add(new Product1(2,"Dell Laptop",30000f));  
        productsList.add(new Product1(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product1(4,"Sony Laptop",29000f));  
        productsList.add(new Product1(5,"Apple Laptop",90000f));  
        
        for ( Product1 product1 : productsList) {
			System.out.println(product1.getName());
		}
          
        @SuppressWarnings("unchecked")
		Map<Integer,String> productPriceList =
                productsList.stream().collect(Collectors.toMap(p->p.id,p->p.name));
                            //.filter(p -> p.price > 30000) // filtering data  
                            // .toMap(p->p.price,p->p.name)         // fetching price by referring getPrice method  
                          // .collect(Collectors.toList());  // collecting as list  
        System.out.println(productPriceList);  
        
        List productPriceList2 =
                productsList.stream().map(s->s.getName()).collect(Collectors.toList());
        System.out.println(productPriceList2);
    }  
}  