public class Cow extends Animal {
    public Cow(){
        super("Cow", Type_of_animal.MAMMALS);
    }

    @Override
    public void animalSound() {
        System.out.println("The cow says Moooo");
    }

    @Override
    public void animalEatBreackfast() {
        System.out.println("The cow eats Herb");
    }

    @Override
    public void animalEatLunch() {
        System.out.println("The cow eats Herb");
    }

    @Override
    public void animalEatDinner() {
        System.out.println("Oh my God - says Feeder");
        System.out.println("The cow try to eats meat");
    }
}
