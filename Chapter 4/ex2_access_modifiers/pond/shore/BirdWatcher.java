package pond.shore;                    // same package as Bird
public class BirdWatcher {
    public void watchBird() {
        Bird bird = new Bird();
        bird.floatInWater();               // calling protected member
        System.out.println(bird.text);     // calling protected member
    } 

    public static void main(String[] args) {
        new BirdWatcher().watchBird();
    }
}