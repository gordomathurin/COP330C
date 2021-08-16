public class MainApp {

    public static void main(String[] args) {

        Food food = new Food();

        Thread animal1 = new Thread (
                new Animal(
                        "Rabbit", 0, 5,150, food)
        );

        Thread animal2 = new Thread(
                new Animal (
                        "Turtle", 0,3,100, food)
        );


        animal1.start();
        animal2.start();

    }
}
