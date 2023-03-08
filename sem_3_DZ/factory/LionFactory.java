package sem_3_DZ.factory;

import java.util.*;

import sem_3_DZ.Animal.LionAnimal;
import sem_3_DZ.Cage.LionCage;

public class LionFactory {

   public static ArrayList<LionAnimal> createLions(int lionCount) {
      List<LionAnimal> lst = new ArrayList<>();
      for (int index = 0; index < lionCount; index++) {
         LionAnimal la = new LionAnimal();
         lst.add(la);
      }
      return (ArrayList<LionAnimal>) lst;
   }
}