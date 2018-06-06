public class Chicken {
    int numEggs = 0; //initial line
    String name;
    public Chicken() {
        name = "Duke"; //initial in constuctor
    }
    public static void main(String[] args) {
        Chicken ch = new Chicken();
        System.out.println(ch.name);
    }
} 