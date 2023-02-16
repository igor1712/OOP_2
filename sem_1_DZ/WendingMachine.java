package sem_1_DZ;

import java.util.ArrayList;
import java.util.List;

//Торговая машина
public class WendingMachine {
   
    private String name = "default";
    protected ArrayList<Product> productList;

    public WendingMachine(String firstMachine) {
        this.name = firstMachine;
        this.productList = new ArrayList<Product>();
    }

    public void addProduct (Product product){
        productList.add(product);
    }
    public Product returnProduct(String name){
        for (Product el: productList) {
            if(el.getName().equals(name)) return el;
        }
        return null;
    }
    public void printProducts(){
        for (var el: this.productList
             ) {
            System.out.println(el);
        }
    }
  

   
    


    
    

    
}

