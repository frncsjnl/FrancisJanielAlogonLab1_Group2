import java.util.Map;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		/*
		ArrayList<Integer> numList = new ArrayList();
		numList.add(4);
		numList.add(5);
		numList.add(-1);
		numList.add(10);
		numList.add(11);
		
		System.out.println(Numbers.computeSum(numList));
		*/
		
		Date d1 = new Date(12,27,1996);
		Date d2 = new Date(11,03,2000);
		Date d3 = new Date(9,23,2002);
		Date d4 = new Date(8,20,2020);
		
	/*	if(d1.compareTo(d2) == 1) {
			System.out.println(d1 + " is more recent than " + d2);
		}else if(d1.compareTo(d2) == -1) {
			System.out.println(d1 + " is later than " + d2);
		}else {
			System.out.println(d1 + " and " + d2 + " are the same dates...");
		}
		
		*/
		
		TreeMap<Date, String> syllabus = new TreeMap();
		syllabus.put(d1,"Java");
		syllabus.put(d2,"Phyton");
		syllabus.put(d3,"JavaScript");
		syllabus.put(d4,"C++");
		
		for(Map.Entry<Date, String> lesson: syllabus.entrySet()) {
			if(lesson.getKey().month == 9 && lesson.getKey().year == 2002) {
				System.out.println(lesson.getValue() + " is on September 2002");
			}else {
				System.out.println(lesson.getValue() + " does not fall on September 2002");
			}
		}
	}

}

