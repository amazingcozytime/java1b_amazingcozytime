package course40;

public class Sample02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] numbers = { 10, 20, 30, 40, 50 };
		for (int i = 0; i < numbers.length; i++) {

			System.out.println(numbers[i]);
		}
		String[] cities = { "東京", "千葉", "神奈川", "だ埼玉" };
		for (int i = 0; i < cities.length; i++) {

			System.out.println(cities[i]);
		}
		int num = 0;
		int[] number = { 10, 20, 30, 40, 50 };
		for (int i = 0; i < number.length; i++) {
			num = num + number[i];
		}
		System.out.println(num);
		int max = 0;
		int[] number1 = { 10, 20, 30, 40, 50 };
		for (int i: number1) {
			if (max <= i) {
				max = i;
				

			}
		}
		System.out.println(max);
		int[] number2 = { 11, 20, 31, 40, 51 };
		for (int m = 0; m < number2.length; m++) {
			int mun = number2[m] % 2;
			if (mun == 1) {
				System.out.println(number2[m]);
			}
		}

	}

}
