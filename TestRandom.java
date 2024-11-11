public  class  TestRandom {
	public static void main(String[]  args) {
		int N = Integer.parseInt(args[0]);
        int countBiggerThanHalf = 0;
        int countLessThanOrEqualHalf = 0;
        double rand; 

        for (int i = 0; i < N; i++) {
            rand = Math.random();
            if (rand > 0.5)
                countBiggerThanHalf++;
            else
                countLessThanOrEqualHalf++;
        }

        System.out.println("> 0.5: " + countBiggerThanHalf + " times");
        System.out.println("<= 0.5: " + countLessThanOrEqualHalf + " times");

        if (countBiggerThanHalf == 0 || countLessThanOrEqualHalf == 0) {
            System.out.println("Ratio: undefined (avoid division by zero)");
        } else {
            double ratio = (double) countBiggerThanHalf / countLessThanOrEqualHalf;
            System.out.println("Ratio: " + ratio);
        }
	}
}
