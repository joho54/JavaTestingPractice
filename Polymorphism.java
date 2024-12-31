class MathUtils{
    public int add(int a, int b){
        return a + b;
    }

    public double add(double a, double b){
        return a + b;
    }
}

class Animal{
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows.");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Cat();
        myAnimal.sound();
        MathUtils mathUtils = new MathUtils();
        int sum1 = mathUtils.add(3, 3);
        double sum2 = mathUtils.add(3.3, 3.3);
        System.out.println(sum1 + " " + sum2);
    }
}
