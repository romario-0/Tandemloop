public class Problem3 {
	
	public static String seriesGen(int a) {
		String strSeries = "";
		int x = (a % 2 == 0) ? a -1 : a;
		for(int i=0; i < x; i++) {
			strSeries += ((i * 2) + 1);
			strSeries += i == x-1 ? "" : ",";
		}
		return strSeries;
	}

	public static void main(String[] args) {
		System.out.println(seriesGen(1));
		System.out.println(seriesGen(2));
		System.out.println(seriesGen(3));
		System.out.println(seriesGen(4));
		System.out.println(seriesGen(5));
		System.out.println(seriesGen(6));
	}
	
}
