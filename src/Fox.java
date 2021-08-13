public class Fox extends Animal{
    public Fox(){
        super("Fox", Type_of_animal.MAMMALS);
    }

    @Override
    public void animalSound() {
        System.out.println("What Does the Fox Say?"); // Ring-ding-ding-ding-dingeringeding
    }

    @Override
    public void animalEatBreackfast() {
        System.out.println("The fox eat`s chiken");
    }

    @Override
    public void animalEatLunch() {
        System.out.println("The fox eat`s beef");
    }

    @Override
    public void animalEatDinner() {
        System.out.println("The fox eat`s pork with vitamin");

    }
}
