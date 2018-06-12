public class Swan {
    private int numberEggs;                    // private
    public int getNumberEggs() {                    // getter
         return numberEggs;
    }
    public void setNumberEggs(int numberEggs) {     // setter
        if (numberEggs >= 0)                     // guard condition
            this.numberEggs = numberEggs;
    } 
    public static void main(String[] args) {
        Swan sw = new Swan();
        sw.setNumberEggs(10);
        System.out.println(sw.getNumberEggs());
    }
}