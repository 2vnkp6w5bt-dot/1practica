package mirea.lab1;
import java.util.Scanner;

public class Lab1 {
    public static long calculateFact(int n){
        long result = 1;
        for (int i=1; i<=n; i++){
            result *= i;
        }
        return result;
    }

    public static void main (String[] args){
        System.out.println("Задание 1");
        int[] arr = {1, 6, 6, 2, 3};
        int sum = 0;
        for (int i=0; i<arr.length; i++){
           sum+=arr[i];
        }
        double mean = (double) sum/arr.length;
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее элементов: " + mean);

        System.out.println("Задание 2");
        System.out.println("Введите длину массива");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        System.out.println("Введите целые числа - элементы массива");
        int[] arr2 = new int[len];
        for (int i=0; i<len; i++){
            arr2[i] = sc.nextInt();
        }
        int sumWhile = 0;
        int sumDoWhile = 0;
        int i = 0;
        while (i<len){
            sumWhile += arr2[i];
            i++;
        }
        i = 0;
        do {
            sumDoWhile += arr2[i];
            i++;
        } while(i<len);

        int maxArr2 = arr2[0];
        int minArr2 = arr2[0];
        for(int j=0; j<len; j++){
            if (arr2[j]>maxArr2) {
                maxArr2 = arr2[j];
            }
            if (arr2[j]<minArr2){
                minArr2 = arr2[j];
            }
        }
        System.out.println("Сумма с помощью While " + sumWhile);
        System.out.println("Сумма с помощью DoWhile " + sumDoWhile);
        System.out.println("Минимальный элемент массива " + minArr2);
        System.out.println("Максимальный элемент массива " + maxArr2);

        System.out.println("Задание 3");
        System.out.println("Аргументы командной строки");
        if (args.length==0) {
            System.out.println("Нет аргументов");
        } else{
            for (int j=0; j<args.length; j++) {
                System.out.println(args[j]);
            }
        }

        System.out.println("Задание 4");
        for (int j=1; j<=10; j++){
            double value = 1.0/j;
            System.out.printf("1/%d = %.2f%n", j, value);
        }

        System.out.println("Задание 5");
        int number = 5;
        System.out.println(calculateFact(number));
    }
}
