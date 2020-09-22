package ProgLang;

public class InstanceCounter {

    private static int numInstances = 1;

    protected static int getCount() {
        return numInstances;
    }

    private static void addInstance() {
        numInstances++;
    }

    public static void main(String[] arguments) {
        System.out.println("Начиная с " +
                InstanceCounter.getCount() + " экземпляра");
        for (int i = 0; i < 499; ++i){
            addInstance();
        }
        System.out.println("Создано " +
                InstanceCounter.getCount() + " экземпляров");

    }
}