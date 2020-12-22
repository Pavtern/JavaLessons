package Nasted;

public class Electrocar {
    private class Motor{
        public void startMotor(){
            System.out.println("Motor " + id + " is starting");
        }
    }

    private int id;

    public Electrocar(int id){
        this.id = id;
    }

    public void start(){
        Motor motor = new Motor();
        motor.startMotor();
        System.out.println("Electrocar "+ id + " is starting");
    }
}
final class O{

}
