
public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n = 10;
		double m = n/2;
		for(double i = 2;i <= m; i++){
			if((i*i) == n){
				System.out.println("Sqrt is " + i);
				break;
			}
		}
	}

}
