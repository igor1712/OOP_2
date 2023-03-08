package sem_3_DZ;

import java.util.ArrayList;

import sem_3_DZ.Animal.WolfAnimal;

import sem_3_DZ.Cage.WolfCage;

public class Main {
    public static void main(String[] args) {
        WolfAnimal wa1 = new WolfAnimal(11, 0, 0);
        WolfAnimal wa2 = new WolfAnimal(3, 0, 0);
        WolfAnimal wa3 = new WolfAnimal(12, 0, 0);
        WolfAnimal wa4 = new WolfAnimal(22, 0, 0);

        ArrayList lstWolf = new ArrayList<>();
        WolfCage wc = new WolfCage(lstWolf);
        wc.addAnimal(wa1);
        wc.addAnimal(wa2);
        wc.addAnimal(wa3);
        wc.addAnimal(wa4);

        wc.printWolf();
        System.out.println();
        wc.sortByage();
        wc.printWolf();
    }
}
