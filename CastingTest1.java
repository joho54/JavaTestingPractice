public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe; // implicit up casting casting has done. = car = (Car) fe;
        // car.water(); -> error
        fe2 = (FireEngine) car; // down casting should be done explicitly. 
        fe2.water(); 
    }    
}

class Car{
    String color;
    int door;

    void drive(){
        System.out.println("drive, brrr~~~");
    }

    void stop(){
        System.out.println("stop!!");
    }
}

class FireEngine extends Car{
    void water(){
        System.out.println("water!!");
    }
}