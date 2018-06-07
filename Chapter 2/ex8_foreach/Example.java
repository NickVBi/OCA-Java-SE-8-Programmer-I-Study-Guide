public class Example {
    public static void main(String[] args) {
        final String[] names = new String[3];
        names[0] = "Lisa";
        names[1] = "Kevin";
        names[2] = "Roger";
        for(String name : names) {
          System.out.print(name + ", ");
        }

        System.out.println("\nSecond example");
        java.util.List<String> values = new java.util.ArrayList<String>();
        values.add("Lisa");
        values.add("Kevin");
        values.add("Roger");
        for(String value : values) {
          System.out.print(value + ", ");
        }
        
        System.out.println("\nThird example");
        for(int i=0; i<values.size(); i++) {
          String name = values.get(i);
          if(i>0) {
            System.out.print(", ");
          }
            System.out.print(name);
        }

        System.out.println("\nFourth example");
        int[] new_values = new int[3];
        new_values[0] = 10;
        new_values[1] = new Integer(5);
        new_values[2] = 15;
        for(int i=1; i<new_values.length; i++) {
            System.out.print(new_values[i]-new_values[i-1]+ ", ");
        }    

    }
}