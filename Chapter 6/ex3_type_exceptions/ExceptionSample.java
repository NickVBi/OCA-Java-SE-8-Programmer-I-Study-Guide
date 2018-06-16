class AnimalsOutForAWalk extends RuntimeException { }
class ExhibitClosed extends RuntimeException { }
class ExhibitClosedForLunch extends ExhibitClosed { }

public class ExceptionSample {
    void explore() {
        try {
            fall();
            System.out.println("never get here");
       } catch (ExhibitClosedForLunch  e) {
            System.out.println("try back later");
        } catch (ExhibitClosed  e)  {
            System.out.println("not today");
        }
        System.out.println("go home");
    }
    void fall() {  throw new ExhibitClosedForLunch(); }

    public static void main(String[] args) {
        new ExceptionSample().explore();
    }
}