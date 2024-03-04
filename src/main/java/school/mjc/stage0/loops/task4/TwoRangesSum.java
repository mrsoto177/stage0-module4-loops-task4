package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
    	int sum = numberToSkip + lastInRow;
    	int counted = 0;
    	for(int i=0; i<=lastInRow;i++) {
    		counted  +=i;
    		if(numberToSkip > lastInRow ) {
    			System.out.println("number to skip is bugger than the last");
    			break;
    		} else if(lastInRow < 0){
    			System.out.println("last number in row is negative");
    			break;
    		} else {
    			System.out.println("skipped sum is " + sum + " counted sum is " + counted);
    			break;
    		}
    	}
    }
    public static void main(String[] args) {
    	TwoRangesSum sum = new TwoRangesSum();
    	sum.printSumOfTwoRanges(90, 90);
    }
    
}
