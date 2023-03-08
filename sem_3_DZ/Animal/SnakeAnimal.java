package sem_3_DZ.Animal;

public class SnakeAnimal extends Animal {
    protected static final int MAX_WEIGTH = 100;
    protected static final String TYPE = "Snake";
    protected int bodyLenght; // длинна корпуса

    public SnakeAnimal(int age, int weigth, int limbs, int countLimbs, int bodyLenght) {
        super(age, weigth, limbs);
        this.bodyLenght = bodyLenght;
    }

    public int getBodyLenght() {
        return bodyLenght;
    }

    @Override
    public String getType() {
        return TYPE;
    }

    public void setBodyLenght(int bodyLenght) {
        this.bodyLenght = bodyLenght;
    }

}
