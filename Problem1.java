class Calculator{
	
	public double calculate(double a, double b, String operationType) {
		if("addition".equalsIgnoreCase(operationType) || "add".equalsIgnoreCase(operationType)) {
			return a + b;
		} else if("subtraction".equalsIgnoreCase(operationType) || "subtract".equalsIgnoreCase(operationType)) {
			return a - b;
		} else if("multiplication".equalsIgnoreCase(operationType) || "multiply".equalsIgnoreCase(operationType)) {
			return a * b;
		} else if("division".equalsIgnoreCase(operationType) || "divide".equalsIgnoreCase(operationType)) {
			return a / b;
		}
		return 0;
	}
}

public class Problem1 {
	

	public static void main(String[] args) {
		double res = 0;
		Calculator obj1 = new Calculator();
		res = obj1.calculate(10, 5, "add");
		System.out.println(res);
		res = obj1.calculate(10, 5, "subtract");
		System.out.println(res);
		res = obj1.calculate(10, 5, "multiply");
		System.out.println(res);
		res = obj1.calculate(10, 5, "divide");
		System.out.println(res);
	}

}
