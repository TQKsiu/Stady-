
package Lab03;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào 1 số nguyên bất kỳ: ");
		int value = scanner.nextInt();

		int count = 0;
		for (int i = 2; i <= value - 1; i++) {
			if (value % i == 0) {
				System.out.println("Ước số khác: " + i);
				count++;
//					break;
			}
		}
		if (count == 0) {
			System.out.printf("%d là số nguyên tố", value);
		} else {
			System.out.printf("%d là số KHÔNG LÀ SỐ nguyên tố", value);
		}
		scanner.close();
	}
}