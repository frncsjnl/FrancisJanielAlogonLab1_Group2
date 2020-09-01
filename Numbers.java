import java.util.ArrayList;

public class Numbers {
	
	 ArrayList<Integer> numbers = new ArrayList();
	 
	 static int computeSum(ArrayList<Integer> ints) {
		 int sum = 0;
		 for(int num: ints) {
			 sum = sum + num; //or sum += num;
		 }
		 return sum;
	 }
	 
}