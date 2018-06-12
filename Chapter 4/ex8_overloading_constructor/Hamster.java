public class Hamster {
    private String color;
    private int weight;
    public Hamster(int weight) {   
        this(weight, "brown");              // first constructor
    }
    public Hamster(int weight, String color) {     // second constructor
        this.weight = weight;
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public int getWeight() {
        return weight;
    }
    public static void main(String[] args) {
        Hamster h1 = new Hamster(3);
        Hamster h2 = new Hamster(5, "white");
        System.out.println(h1.getColor() + " " + h1.getWeight());
        System.out.println(h2.getColor() + " " + h2.getWeight());       
    }

}