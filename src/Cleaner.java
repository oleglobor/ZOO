public class Cleaner implements Worker{ //а це прибиральник
    @Override
    public void work() {
        System.out.println("The Cleaner cleans zoo");

    }

    @Override
    public void coffetime() {
        System.out.println("The Cleaner drinks coffe and listening hard rock");

    }
}
