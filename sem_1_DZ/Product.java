package sem_1_DZ;
// продукты
public class Product {
    String name;
    int price;


    Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    
    public String getName(){
        return this.name;
    }
    public Integer getPrice(){
        return this.price;
    }


    public void setName(String name){
        this.name = name;
    }
    public void setPrice(Integer price){
        this.price = price;
    }


    @Override
    public String toString(){
        return name + ": " + price;
    }


    public void consume(){
        System.out.println("Продукт потреблен");
    }
    
}
