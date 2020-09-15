public class Exercise_8 {

	public static void main(String[] args) {
		double averageSum = 0;
		double multiply = 1;
		int n = 0;
		int x = (int)(Math.random() * 20);
		System.out.println(x + " ... 1й х - генерируется для вхождения в цикл");
		while(x != 0) {
		multiply *= x;
		n ++;
		x = (int)(Math.random() * 20);
		System.out.println(multiply + "  ... результат перемножения");
		System.out.println(n);
		System.out.println("генерируется... " + x);
		}
		if(n != 0){
		averageSum = multiply / n;
		} else {
		averageSum = 0;
		}
		System.out.println("среднее:" + averageSum);
	}

}