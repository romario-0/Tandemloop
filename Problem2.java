public class Problem2 {
	
	public static String seriesGen(int x) {
		String strSeries = "";
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
