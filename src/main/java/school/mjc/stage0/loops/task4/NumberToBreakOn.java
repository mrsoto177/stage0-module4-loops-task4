package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
	public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
		boolean mensajeImpreso = false;
		
		
		if(toBreakWith < numberToGoUntil) {
			for (int i = 1; i < numberToGoUntil; i++) {
				System.out.println(i);
				if (i == toBreakWith) {
					
					break;
				}
			}
		}
		
		
		else if (numberToGoUntil < toBreakWith) {
				{
					System.out.println("iterating till the end");
					
					
					for (int i = 1; i <= toBreakWith; i++) {
						System.out.println(i);
						if (i == numberToGoUntil) {
							
							break;
						}
					}
				}
			}
		
		 

		
		
		
	}

	public static void main(String[] args) {
		NumberToBreakOn number = new NumberToBreakOn();
		number.printNumbersUntilWithBreakOn(6, 5);
	}
}
