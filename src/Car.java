public class Car {
    int gas;
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    public Car() {

    }

    void setGas(int gas){
        this.gas = gas;
    }

    boolean isLeftGas(){
        if(gas == 0){
            System.out.println("gas가 없다");
            return false;
        }
        System.out.println("gas있음");
        return true;
    }

    void run(){
        while(true){
            if(gas > 0){
                System.out.println("달린다. 잔량 : "+ gas);
                gas-=1;
            }else{
                System.out.println("멈춘다. 잔량 : " + gas);
                return;
            }
        }
    }

    Car(String model){
        this(model, "은색",250);
    }

    Car(String model, String color){
        this(model,color,250);
    }

    Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
