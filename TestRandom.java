public  class  TestRandom {
	public static void main(String[]  args) {
		int N = Integer.parseInt(args[0]);
        int countBiggerThanHalf = 0;
        int countLessThanOrEqualHalf = 0;
        double ratio = 0.0;
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

        if(countLessThanOrEqualHalf!=0 && countBiggerThanHalf!=0){
			if(countLessThanOrEqualHalf < countBiggerThanHalf)
                ratio = (double) countLessThanOrEqualHalf/countBiggerThanHalf;
            else
                ratio = (double) countBiggerThanHalf/countLessThanOrEqualHalf;
			System.out.print("Ratio: " + ratio);
		}
	}
}
