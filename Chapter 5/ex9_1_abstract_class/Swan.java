public class Swan extends Animal {
    public String getName() {
        return "Swan";
    }
    public static void main(String[] args) {
        Swan b = new Swan();
        b.getName();
        b.eat();
    }
}