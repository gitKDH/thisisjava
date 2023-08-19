public class Car {
    String company = "현대자동차";
    String model = "그랜저";
    String color = "검은색";
    int speed;
    int maxSpeed = 350;
    boolean start;
    Tire tire;

    Car(){}

    Car(String model){
        this.model = model;
    }

    Car(String model, String color){
        this.model = model;
        this.color = color;
    }

    Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
