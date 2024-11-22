public class Collatz {
    public static void main(String[] args) {
        int seed = Integer.parseInt(args[0]);
        String mode = args[1];

        for (int i = 1; i <= seed; i++) {
            int N = i; 
            int count = 0; 
            String step = "";

     
            do {
                step += N + " ";
                N = (N % 2 == 0) ? N / 2 : N * 3 + 1;
                count++;
            } while (N != 1);

            step += "1 (" + (count + 1) + ")"; 

        
            if (mode.equals("v")) {
                System.out.println(step);
            }
        }

       
        System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
    }
}