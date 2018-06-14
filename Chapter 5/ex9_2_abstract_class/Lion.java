public class Lion extends BigCat {
    public String getName() {
        return "Lion is "+super.getName();
    }
    public void roar() {
        System.out.println("The Lion lets out a loud ROAR!");
    }
    public static void main(String[] args) {
        Lion l = new Lion();
        System.out.println(l.getName());
        l.roar();
    }
}