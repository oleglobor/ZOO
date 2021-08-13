public class Parrot extends Animal{
    public Parrot(){
        super("Parrot", Type_of_animal.BIRDS);
    }

    @Override
    public void animalSound() {
        System.out.println("The parrot can talk. He say: Polly want this cookies");
    }

    @Override
    public void animalEatBreackfast() {
        System.out.println("The parrot eat seed");
    }

    @Override
    public void animalEatLunch() {
        System.out.println("The parrot eat cookies");

    }

    @Override
    public void animalEatDinner() {
        System.out.println("The parrot eat seed with a drug that increases mental ability");
        System.out.println("This parrot will conquer the world"); //
    }
}
