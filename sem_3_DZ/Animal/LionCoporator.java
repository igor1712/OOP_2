package sem_3_DZ.Animal;

import java.util.Comparator;

public class LionCoporator implements Comparator<LionAnimal> {

    @Override
    public int compare(LionAnimal o1, LionAnimal o2) {
        if (o1.getManeVolume() > o2.getManeVolume())
            return 1;
        else if (o1.getManeVolume() < o2.getManeVolume())
            return -1;
        return 0;
    }
}
