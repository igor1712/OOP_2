package sem_3_DZ.Animal;

public class WolfAnimal extends Animal {

    @Override
    public String getType() {
       return "Wolf";
    }
    
    public WolfAnimal(int age, int weigth, int limbs) {
        super(age, weigth, limbs);
    }

    @Override
    public String toString() {
        return "WolfAnimal. age: " + getAge();
    }

  
    
    
    
}
