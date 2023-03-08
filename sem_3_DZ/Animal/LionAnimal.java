package sem_3_DZ.Animal;

public class LionAnimal extends Animal implements Comparable<LionAnimal> {
    private int maneVolume; // обьем гривы
    private static final int MAX_WEIGTH = 100;
    protected static String TYPE = "Line";

    public LionAnimal() {
    }

    public LionAnimal(int age, int weigth, int limbs, int maneVolume) {
        super(age, weigth, limbs);
        this.maneVolume = maneVolume;
    }

    public int getManeVolume() {
        return maneVolume;
    }

    @Override
    public String getType() {
        return TYPE;
    }

    public static int getMaxWeigth() {
        return MAX_WEIGTH;
    }

    public static String getTYPE() {
        return TYPE;
    }

    public void setManeVolume(int maneVolume) {
        this.maneVolume = maneVolume;
    }

    public void feed(int foodWeight) {
        weigth += foodWeight;
        if (getWeigth() > MAX_WEIGTH) {
            System.out.println("Этому Льву больше не насыпать");
        } else {
            System.out.println("Лев покушал и весит" + getWeigth());
        }
    }

    @Override
    public int compareTo(LionAnimal o) {
        if (o.getAge() < 1) return 1;
        else if (o.getAge() > 1) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "LionAnimal maneVolume: " + maneVolume + ", age: " + getAge() ;
    }

   



        
}
