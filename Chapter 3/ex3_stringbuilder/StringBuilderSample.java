public class StringBuilderSample {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("abc"); //CREATING A STRINGBUILDER
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a=" + a); //abcdefg
        System.out.println("b=" + b); //abcdefg

        System.out.println("- CREATING A STRINGBUILDER");
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("animal");
        StringBuilder sb3 = new StringBuilder(10); //slots for characters


        System.out.println("- charAt(), indexOf(), length(), and substring()");
        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch);

        System.out.println("- append()");
        sb = new StringBuilder().append(1).append('c');
        sb.append("-").append(true);
        System.out.println(sb);      // 1c-true

        System.out.println("- insert()");
        sb = new StringBuilder("animals");
        sb.insert(7, "-"); // sb = animals- 
        sb.insert(0, "-"); // sb = -animals- 
        sb.insert(4, "-"); // sb = -ani-mals
        System.out.println(sb);

        System.out.println("- delete() and deleteCharAt()");
        sb = new StringBuilder("abcdef");
        sb.delete(1, 3);      // sb = adef
        sb.deleteCharAt(2);   // sb = adf 
        System.out.println(sb);

        System.out.println("- reverse()");
        sb = new StringBuilder("ABC");
        sb.reverse();
        System.out.println(sb);
        
        System.out.println("- toString()");
        String s = sb.toString();
        System.out.println(s);        
    }
}