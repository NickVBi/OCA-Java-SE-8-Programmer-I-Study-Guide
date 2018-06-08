public class MultArrSample {
    public static void main(String[] args) {
        String [][] rectangle = new String[3][2]; // init mult rect array    
        int[][] differentSize = {{1, 4}, {3}, {9,8,7}}; //init mult array

        // 
        int[][] twoD = new int[3][2];
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++)
                System.out.print(twoD[i][j] + " "); // print element
            System.out.println();                 // time for a new row
        }
        
        for (int[] inner : twoD) {
            for (int num : inner)
              System.out.print(num + " ");
             System.out.println();
        }
    }
}