package sem_3_DZ.Cage;

import java.util.*;

import sem_3_DZ.Animal.Animal;
import sem_3_DZ.Animal.LionAnimal;
import sem_3_DZ.Animal.LionCoporator;

public class LionCage implements AnimalCage {

    private ArrayList<LionAnimal> lineList;
    private static int pollution = 0;

    public LionCage() { // для создания обьекта в main без аргументов
    }

    public LionCage(ArrayList<LionAnimal> lineList) {
        this.lineList = lineList;
    }

    public ArrayList<LionAnimal> getLineList() {
        return lineList;
    }

    @Override
    public void addAnimal(Animal a) {
        lineList.add((LionAnimal) a);
    }

    @Override
    public void addCorm(int weigth) {
        System.out.println("корм добавили");
        pollution += weigth / 2;
        System.out.println(pollution);
        if (pollution >= 100) {
            System.out.println("Почистите клетку");
        }
    }

    @Override
    public void clearCage() {
        System.out.println("Клетка чистая");
        pollution = 0;
    }

    public void printLion(Object o) {
        for (var i : lineList) {
            System.out.println(i);

        }
    }

    public void sortLion() {
        Collections.sort(lineList);
    }

    public void sortByVolume(){
        Collections.sort(lineList, new LionCoporator());
    }

    @Override
    public String toString() {
        return "LionCage [lineList=" + lineList + "]";
    }

   

    
}
