public class Visitor { //відвідувач


        private static int count = 0;

        private static int i = 1;

        private static int id;




        public Visitor() {

            comeToZoo();

            buyTicket();

            id = i++;

        }




        public void comeToZoo() {

            System.out.println("Visitor" + (id + 1) + " comes to Zoo");

        }




        public void buyTicket() {

            System.out.println("Visitor" + (id + 1) + " bought a ticket");

            count++;

        }




        public static int getCount() {

            return count;

        }
}
