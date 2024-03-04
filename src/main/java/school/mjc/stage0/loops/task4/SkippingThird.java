package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
    	
    	
    	
    	
    	for (int i = 0; i <= lastPrinted; i++) {
    		
            if (i % 1 ==0 && i % 3 > 0) {
                System.out.println(i);      
            } 
    	 }
    }
    public static void main(String[] args) {
    	SkippingThird third = new SkippingThird();
    	third.printUntilButThird(7);
    }
}
