public class ImmutableSwan {
    private int numberEggs;
    public ImmutableSwan(int numberEggs) {
      this.numberEggs = numberEggs;
    }
    public int getNumberEggs() {
      return numberEggs;
    } 

    public static void main(String[] args) {
        ImmutableSwan sw = new ImmutableSwan(10);
        System.out.println(sw.getNumberEggs());
    }    
}