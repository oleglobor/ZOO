public class Accountant implements Worker { //це бухгалтер
    @Override
    public void work() {
        System.out.println("Accountant`s report : our zoo has been visited " + Visitor.getCount() + " visitors for day. " +
                "The price of one ticket is 100UAH. " +
                "So the zoo earned " + (Visitor.getCount() * 100) + "UAH for today");

    }

    @Override
    public void coffetime() {
        System.out.println("The accountant drinks vodka during the break");
    }
}
