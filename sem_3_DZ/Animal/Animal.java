package sem_3_DZ.Animal;

public abstract class Animal {
    protected int age; // возраст
    protected int weigth; // вес
    protected int limbs; // конечности

    public Animal() {
    }

    public Animal(int age, int weigth, int limbs) {
        this.age = age;
        this.weigth = weigth;
        this.limbs = limbs;
    }

    public int getWeigth() {
        return weigth;
    }

    public int getAge() {
        return age;
    }

    public int getLimbs() {
        return limbs;
    }

    public abstract String getType();

    
    public void setAge(int age) {
        this.age = age;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public void setLimbs(int limbs) {
        this.limbs = limbs;
    }

    public void feed() {
        weigth += getWeigth();
        if (weigth > getWeigth()) {
            System.out.println("Этому Льву больше не насыпать");
        } else {
            System.out.println("Лев покушал");
        }
    }

    // @Override
    // public String toString() {
    //     return "Animal age=" + age ;
    // }

}
