public class Animal implements Runnable {

    private String name;
    private int position;
    private int speed;
    private int restMax;
    static boolean winner = false;
    private final Food food;

    public Animal(String name, int position, int speed, int restMax, Food food) {
        this.name = name;
        this.position = position;
        this.speed = speed;
        this.restMax = restMax;
        this.food = food;
    }

    public void run() {

        for (position = 0; position <= 100; position++) {
            while (!winner) {
                position += speed;
                if (position >= 100){
                    winner = true;
                    System.out.println("****** Winner: " + getName() + "*******");
                    break;
                }
                try {
                    Thread.sleep((long) (getRestMax() * Math.random()));
                    System.out.println("Runner: " + getName() + " current position: " + getPosition());
                    food.eat(getRestMax());
                    System.out.println(getName() + " is eating ");
                    System.out.println(getName() + " is done eating");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

//    public void eat(){
//
//
//    }

        public String getName () {
            return name;
        }

        public void setName (String name) {
            this.name = name;
        }

        public int getPosition () {
            return position;
        }

        public void setPosition ( int position){
            this.position = position;
        }

        public int getSpeed () {
            return speed;
        }

        public void setSpeed ( int speed){
            this.speed = speed;
        }

        public int getRestMax () {
            return restMax;
        }

        public void setRestMax ( int restMax){
            this.restMax = restMax;
        }

        @Override
        public String toString () {
            return "Animal{" +
                    "name='" + name + '\'' +
                    ", position='" + position + '\'' +
                    ", speed=" + speed +
                    ", restMax=" + restMax +
                    '}';
        }
}
