public class ConcentricPattern {
    public static void main(String[] args) {
        int n = 4;               
        int size = 2 * n - 1;    

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                
                int minDist = Math.min(
                    Math.min(i, size - 1 - i),        
                    Math.min(j, size - 1 - j)         
                );

                int value = n - minDist;
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}