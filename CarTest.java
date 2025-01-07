class Car{
    String color;
    String gearType;
    int door;

    Car(){
        this("white", "auto", 4);
    }
    Car(String color){
        this(color, "auto", 4); 
    }
    Car(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}


public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car(); // -> this("white", "auto", 4);
        Car c2 = new Car("blue"); // -> this(color, "auto", 4); 
        System.out.println("C1:" + c1.color + ", " + c1.gearType + ", " + c1.door);
        System.out.println("C2:" + c2.color + ", " + c2.gearType + ", " + c2.door);
    }
}
