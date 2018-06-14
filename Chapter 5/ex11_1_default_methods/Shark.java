public class Shark implements SharkFamily {
    public double getLongestFinLength() {
        return 35.0;
    }
    public static void main(String[] args) {
        System.out.println(
            new Shark().doFinsHaveScales()
        );
        System.out.println(
            new Shark().getNumberOfFins()
        );
        System.out.println(
            new Shark().getLongestFinLength()
        );
    }
}