package application;

public class CalModel {
	public int calculate(String op, int x, int y) {
		int result = 0;
		switch (op) {
		case "+":
			result = x + y;
			break;
		case "-":
			result = x - y;
			break;
		case "*":
			result = x * y;
			break;
		case "/":
			result = x / y;
			break;
		}
		return result;
	}

}
