// // Посчитайте сколько драгоценных камней в куче обычных камней
// // Пример:
// // jewels = “aB”, stones = “aaaAbbbB”
// // Результат в консоль ”a3B1”

import java.util.Scanner;

public class homework2_0 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите stones: ");
        String stones = iScanner.next();
        System.out.printf("Введите jewels: ");
        String jewels = iScanner.next();
        char[] jewels1 = jewels.toCharArray();
        char[] arr = stones.toCharArray();
        String res = new String();
        for (int i = 0; i < jewels1.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (jewels1[i]==arr[j]) {
                    count++;
                }
            }
            if (count!=0) {
                res = res + jewels1[i] + count;
            }
        }
        System.out.println(res);
    }
}
