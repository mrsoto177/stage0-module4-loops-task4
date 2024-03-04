package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
    	int sum = numberToSkip + lastInRow;
    	int counted = 0;
    	
    	if (lastInRow < 0 || numberToSkip < 0) {
    		System.out.println("last number in row is negative");
    		
    	} else if(numberToSkip > lastInRow ) {
			System.out.println("number to skip is bigger then the last");
			
		} else if (lastInRow > numberToSkip) {
			for(int i=numberToSkip; i<=lastInRow;i++) {
	    		counted  +=i;
		
	    	}
			System.out.println("skipped sum is " + sum + " counted sum is " + counted);
		}
    	
    	
    }
    public static void main(String[] args) {
    	TwoRangesSum sum = new TwoRangesSum();
    	sum.printSumOfTwoRanges(-50, -10);
    }
    
}
