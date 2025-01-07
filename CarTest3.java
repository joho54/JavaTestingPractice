class Car{
    String color;
    String gearType;
    int door;

    Car(){
        this("white", "auto", 4);
    }

    Car(Car c){ // constructor for instance copy
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }

    Car(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class CarTest3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(c1);
        System.out.println("C1:" + c1.color + ", " + c1.gearType + ", " + c1.door);
        System.out.println("C2:" + c2.color + ", " + c2.gearType + ", " + c2.door);
        c1.door = 100;
        System.out.println("c1.door = 100; doesn't affects c2");
        System.out.println("C1:" + c1.color + ", " + c1.gearType + ", " + c1.door);
        System.out.println("C2:" + c2.color + ", " + c2.gearType + ", " + c2.door);
    }    
}
