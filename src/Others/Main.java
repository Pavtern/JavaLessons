package Others;

import com.pavtern.*;

public class Main {
    Car newCar;
    Plane plane;
    public static void main(String[] args) {
        Main main = new Main();
        main.buyBread();
        main.buyMilk();
        System.out.println("I'm Others.Main here");
    }
    void buyBread(){
        System.out.println("Buy bread");
    }
    void buyMilk(){
        System.out.println("Buy milk");
    }
}
