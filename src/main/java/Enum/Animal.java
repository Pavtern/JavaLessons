package Enum;


public enum Animal {
    CAT("кошка"), DOG("собака"), FROG("лягушка");

    private String transition;

    Animal(String transition) {
        this.transition = transition;
    }

    public String getTransition() {
        return transition;
    }

    @Override
    public String toString() {
        return "it's an Animal{" +
                "Перевод на русский язык: '" + transition + '\'' +
                '}';
    }
}
