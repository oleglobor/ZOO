public class Zoo {

        private Accountant accountant;
        private Feeder feeder;
        private Cleaner cleaner;

        Animal parrot = new Parrot();
        Animal turtle = new Turtle();
        Animal fox = new Fox();
        Animal cow = new Cow();


        public Zoo() {
            feeder = new Feeder();
            cleaner = new Cleaner();
            accountant = new Accountant();
        }

        public void open(){
            System.out.println("Zoo is opened!!!");;
            feeder.work();
            parrot.animalEatBreackfast();
            turtle.animalEatBreackfast();
            fox.animalEatBreackfast();
            cow.animalEatBreackfast();
            Visitor visitor1 = new Visitor();
            Visitor visitor2 = new Visitor();
            Visitor visitor3 = new Visitor();
            Visitor visitor4 = new Visitor();
        }

        public void coffetime(){
            System.out.println("Now is lunch");
            Visitor visitor5 = new Visitor();
            Visitor visitor6 = new Visitor();
            feeder.work();
            parrot.animalSound();
            parrot.animalEatLunch();
            turtle.animalEatLunch();
            fox.animalEatLunch();
            cow.animalEatLunch();
            cleaner.work();
            turtle.animalSound();
            fox.animalSound();
            cow.animalSound();
            feeder.coffetime();
            cleaner.coffetime();
            accountant.coffetime();
        }

        public void close(){
            System.out.println("Zoo is closed!!!");
            System.out.println("All visitors exits");
            feeder.work();
            parrot.animalEatDinner();
            turtle.animalEatDinner();
            fox.animalEatDinner();
            cow.animalEatDinner();
            cleaner.work();
            accountant.work();
            parrot.sleep();
            turtle.sleep();
            fox.sleep();
            cow.sleep();
        }
    }

