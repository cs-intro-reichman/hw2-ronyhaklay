public class Collatz {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]); 

        for (int seed = 1; seed <= N; seed++) {
            findSequence(seed); 
        }
        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }

    public static void findSequence(int s) {
        int current = s;
        int length = 0;

        System.out.print(current); 
        length++;

        while (current != 1) {
            if (current % 2 == 0) {
                current /= 2; 
            } else {
                current = 3 * current + 1; 
            }
            System.out.print(" " + current); 
            length++;
        }
        System.out.println(" (" + length + ")"); 
    }
}