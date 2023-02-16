package sem_1_DZ;

import java.util.ArrayList;

//Машина для приготовления горячих напитков
public class HotDrinkVendingMachine extends WendingMachine {
    private double temperature; // "°"
    
    public HotDrinkVendingMachine(String firstMachine, double temperature) {
        super(firstMachine);
        this.temperature = temperature;
    }

    private ArrayList<Drink> drinkList;
    public HotDrinkVendingMachine(String firstMachine) {
        super(firstMachine);
        drinkList = new ArrayList<Drink>();
    }
    public void addDrink(Drink dr){
        drinkList.add(dr);
    }
    public Drink returnProduct(String name){
        for (Drink el: drinkList) {
            if(el.getName().equals(name)) return el;
        }
        return null;
    }

    
    @Override
    public String toString() {
        return "DrinkMachine [drinkList=" + drinkList + "]";
    }  
}
