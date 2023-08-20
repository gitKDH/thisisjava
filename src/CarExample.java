public class CarExample {
    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.setSpeed(-50);
        System.out.println("현재 속도 : " + myCar.getSpeed());

        myCar.setSpeed(60);
        System.out.println("현재 속도 : " + myCar.getSpeed());

        if(!myCar.isStop()){
            myCar.setStop(true);
        }
        System.out.println("현재 속도 : " + myCar.getSpeed());

//        Car myCar = new Car();
//        myCar.setGas(5);
//
//        if(myCar.isLeftGas()){
//            System.out.println("출발");
//            myCar.run();
//        }
//        System.out.println("gas주입하세요");
//        Car car1 = new Car("자가용");
//        System.out.println(car1.company);
//        System.out.println(car1.model);
//        System.out.println();
//
//        Car car2 = new Car("자가용","빨강");
//        System.out.println(car2.company);
//        System.out.println(car2.model);
//        System.out.println(car2.color);
//        System.out.println();
//
//        Car car3 = new Car("택시","검정",200);
//        System.out.println(car3.company);
//        System.out.println(car3.model);
//        System.out.println(car3.color);
//        System.out.println(car3.maxSpeed);
//        System.out.println();

    }
}
