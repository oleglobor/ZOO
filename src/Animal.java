public abstract class Animal { //тваринки
    private String name;
    private Type_of_animal type_of_animal;

    public abstract void animalEatBreackfast();
    public abstract void animalEatLunch();
    public abstract void animalEatDinner();

    public abstract void animalSound();

    public void sleep() {
        System.out.println(name + " sleep");
    }

    public String getName() {
        return name;
    }

    public Type_of_animal getType_of_animal() {
        return type_of_animal;
    }

    public Animal(String name, Type_of_animal type_of_animal) {
        this.name = name;
        this.type_of_animal = type_of_animal;
    }
}

