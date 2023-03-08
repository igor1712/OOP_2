package sem_3_DZ.Animal;

import java.util.Comparator;

public class WolfComporator implements Comparator<WolfAnimal> {

    @Override
    public int compare(WolfAnimal o1, WolfAnimal o2) {
        if (o1.getAge() > o2.getAge())
            return 1;
        else if (o1.getAge() < o2.getAge())
            return -1;
        return 0;
    }



}
