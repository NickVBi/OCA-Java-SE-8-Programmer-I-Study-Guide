import java.util.ArrayList;
public class ArrayListSample {
    public static void main(String[] args) {
        // init arrayList
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList(10);
        ArrayList list3 = new ArrayList(list2);
        
        // old init from Java5 with diamond operator
        ArrayList<String> list4 = new ArrayList<String>();
        ArrayList<String> list5 = new ArrayList<>();    
    
        // add()
        ArrayList list = new ArrayList();
        list.add("hawk");          // [hawk]
        list.add(Boolean.TRUE);    // [hawk, true]
        System.out.println(list);  // [hawk, true]

        ArrayList<String> safer = new ArrayList<>();
        safer.add("sparrow");
        // safer.add(Boolean.TRUE);    // DOES NOT COMPILE

        ArrayList<String> birds = new ArrayList<>();
        birds.add("hawk");            // [hawk]
        birds.add(1, "robin");        // [hawk, robin]
        birds.add(0, "blue jay");     // [blue jay, hawk, robin]
        birds.add(1, "cardinal");     // [blue jay, cardinal, hawk, robin]
        System.out.println(birds);    // [blue jay, cardinal, hawk, robin]
    
        // remove()
        birds = new ArrayList<>();
        birds.add("hawk");     // [hawk]
        birds.add("hawk");     // [hawk, hawk]
        System.out.println(birds.remove("cardinal")); // prints false
        System.out.println(birds.remove("hawk")); // prints true
        System.out.println(birds.remove(0)); // prints hawk
        System.out.println(birds);     // []

        // set()
        birds.add("hawk");                    // [hawk]
        System.out.println(birds.size());     // 1
        birds.set(0, "robin");               // [robin]
        System.out.println(birds.size());     // 1
        //birds.set(1, "robin");               // IndexOutOfBoundsException

        birds.remove(0);
        // isEmpty() and size()
        System.out.println(birds.isEmpty());     // true
        System.out.println(birds.size());     // 0
        birds.add("hawk");                    // [hawk]
        birds.add("hawk");                    // [hawk, hawk]
        System.out.println(birds.isEmpty());     // false
        System.out.println(birds.size());     // 2

        //clear()
        birds.clear();                         // []
        System.out.println(birds.isEmpty());     // true
        System.out.println(birds.size());     // 0
        
        // contains()
        birds.add("hawk");                         // [hawk]
        System.out.println(birds.contains("hawk")); // true
        System.out.println(birds.contains("robin")); // false
    
        // equals()
        ArrayList<String> one = new ArrayList<>();
        ArrayList<String> two = new ArrayList<>();
        System.out.println(one.equals(two));      // true
        one.add("a");                         // [a]
        System.out.println(one.equals(two));     // false
        two.add("a");                         // [a]
        System.out.println(one.equals(two));     // true
        one.add("b");                         // [a,b]
        two.add(0, "b");                    // [b,a]
        System.out.println(one.equals(two));     // false
    }
}