public class Problem4 {
	
	public static String dictionary(int[] numArr){
		
		String str = "{";
		int count;
		
		for(int i=1; i <= 9; i++) {
			count = 0;
			for(int j=0; j < numArr.length ; j++) {
				if(numArr[j] % i == 0) {
					count++;
				}
			}
			str +=  i + ":" + count;
			str += i == 9 ? "" : ",";
		}
		str += "}";

		return str;
	}
	
	public static void main(String[] args) {
		int testArr[] = {1,2,8,9,12,46,76,82,15,20,30}; 
		System.out.println(dictionary(testArr));
	}
}
