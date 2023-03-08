package sem_3_DZ.Cage;

import java.util.ArrayList;
import java.util.Collections;

import sem_3_DZ.Animal.Animal;
import sem_3_DZ.Animal.WolfAnimal;
import sem_3_DZ.Animal.WolfComporator;

public class WolfCage implements AnimalCage {

    private ArrayList<WolfAnimal> wolfList;
    

    public WolfCage() {
    }

    public WolfCage(ArrayList<WolfAnimal> wolfList) {
        this.wolfList = wolfList;
    }

    public void sortByage() {
        Collections.sort(wolfList, new WolfComporator());
    }

    @Override
    public void addAnimal(Animal a) {
        wolfList.add((WolfAnimal) a);
    }

    @Override
    public void addCorm(int weigth) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addCorm'");
    }

    @Override
    public void clearCage() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clearCage'");
    }
   
    public void printWolf() {
        for (var i : wolfList) {
            System.out.println(i);

        }
    }

}
