public class Collatz {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Collatz N mode");
            return;
        }

        int N = Integer.parseInt(args[0]);
        String mode = args[1];

        if (!mode.equals("v") && !mode.equals("c")) {
            System.out.println("Mode must be 'v' or 'c'");
            return;
        }

        for (int seed = 1; seed <= N; seed++) {
            int steps = 0;
            int current = seed;
            String sequence = "";

            do {
                if (sequence.isEmpty()) {
                    sequence = Integer.toString(current);
                } else {
                    sequence += " " + current;
                }
                steps++;
                if (current == 1) {
                    break;
                } else if (current % 2 == 0) {
                    current = current / 2;
                } else {
                    current = current * 3 + 1;
                }
            } while (true);

            if (mode.equals("v")) {
                System.out.println("     " + sequence + " (" + steps + ")");
            }
        }

        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}