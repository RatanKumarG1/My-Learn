package ds;

public class Atm {

	public static final int[] DENOMS = { 1, 2, 3, 5};

	public static void main(String[] args) {
//		comb(5);
		long longWithL = 1000*60*60*24*365L;
		long longWithoutL = 1000*60*60*24*365;
		System.out.println(longWithL);
		System.out.println(longWithoutL);
		
	}

	public static void comb(int input) {
		if (input != 0) {
			for (int i = 0; i < DENOMS.length; i++) {
				
					int div = input/DENOMS[i];
					int rem = input % DENOMS[i];
				if(input - rem >= DENOMS[i]){
					print(DENOMS[i], div);
					comb(rem);
					
				} else if(DENOMS[i] + rem == input){
					System.out.println(DENOMS[i] + "" + rem);
				}
				if (rem == 0) {System.out.println();}
			}
		}
	}

	public static void print(int input, int iTimes) {
		for (int i = 0; i < iTimes; i++) {
			System.out.print(input);
		}
	}

}
