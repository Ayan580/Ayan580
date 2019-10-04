import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {2, 4, -5, 25, 60, 81, 30};
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        numbers[2] = 30;
        System.out.println(numbers[3]);

        int[][] arr = {{2, 40}, {6, 8}, {9, -7}};
        System.out.println(arr[0][1]);


        for (int i = 2; i <= 6; i = i + 3) {
            System.out.println(i);
        }
        for (int i = 1; i <= 9; i++) {// i=i+1;
            System.out.println(i + "x8=" + (i * 7));

        }

        String str = "1";
        while (str.length() <= 10) {
            str = str + "3";
            System.out.println(str);
            System.out.println("Размер слова = " + str.length());
        }

        String[] names = new String[3];
        names[0] = "доброе утро ! Bakyt";
        names[1] = "добрый день !Maksat";
        names[2] = "добрый вечер !John";
        System.out.println("Введите индекс 0 - 2:");
        Scanner s = new Scanner(System.in);
        System.out.println(names[s.nextInt()]);
    }



}

