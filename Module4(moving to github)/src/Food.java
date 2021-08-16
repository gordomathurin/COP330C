public class Food {

    synchronized public void eat(int eatTime) {
        try {
            Thread.sleep(eatTime);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

}
