public class Test2 {

	public static void main(String[] args) {
		tableOfSquares(1, 10);
	}
	
	static void tableOfSquares(int n) {
		for(int i=1; i<=n; i++) {
			System.out.println(i + " " + i*i);
		}
	}
	
	static void tableOfSquares(int i, int n) {
		if(i <= n) {
			System.out.println(i + "," + i*i);
			tableOfSquares(i+1, n);
		}else {
			return;
		}
	}

}
