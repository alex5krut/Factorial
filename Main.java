public class Main {
	
	public static void main(String args[]){
		Main main = new Main();
		System.out.println(main.Factorial(5));
	}
	
	public int Factorial(int number){
		int point = 1;
		int factorial = 1;
		while(point != number + 1){
		factorial *= point;
		point ++;
		}
		return factorial;
	}
}
