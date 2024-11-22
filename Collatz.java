public class Collatz {
    public static void main(String[] args) {
        int seed = Integer.parseInt(args[0]);
        String mode = args[1];
        String step;

        for (int i = 1; i <= seed; i++) {
            int count = 1; 
            int N = i; 
            step = "";
            do {
                N = N % 2 == 0 ? N / 2 : N * 3 +1;
                step += N + " ";
                count++;
            } 
            while (N != 1);
            step += N + " (" + count + ")";
            if (mode.equals("v")) {
                System.out.println(step);
        }

        System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
    }
}
}