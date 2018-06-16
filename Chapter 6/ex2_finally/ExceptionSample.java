public class ExceptionSample {
    void explore() {
        try {
            fall();
            System.out.println("never get here");
        } catch (RuntimeException e) {
            System.out.println("get up");
        } finally {
            System.out.println("see more animals");
        }
        System.out.println("go home");
    }
    void fall() {  throw new RuntimeException(); }
    public static void main(String[] args) {
        new ExceptionSample().explore();
    }
}