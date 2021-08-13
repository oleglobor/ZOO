public class Turtle extends Animal{ //
    public Turtle(){
        super("Turtle", Type_of_animal.REPTILE);
    }

    @Override
    public void animalSound() {
        System.out.println("The turtle just eating.");
    }

    @Override
    public void animalEatBreackfast() {
        System.out.println(" The turtle eats vegetables");
    }



    @Override
    public void animalEatLunch() {
        System.out.println(" The turtle eats vegetables again");
    }

    @Override
    public void animalEatDinner() {
        System.out.println(" The turtle eats vegetables with vitamins");
    }
}
