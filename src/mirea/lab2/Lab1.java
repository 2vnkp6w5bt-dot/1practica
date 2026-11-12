package mirea.lab2;

public class Lab1 {
    public static void recursion2 (int n){
        if (1>n)
            return;
        recursion2(n-1);
        System.out.println(n + " ");

    }

    public static void recursion3(int a, int b) {
        System.out.println(a + " ");
        if (a==b)
            return;
        if (a<b)
            recursion3(a+1, b);
        else
            recursion3(a-1, b);
    }

    public static int countNumbers(int k, int s) {
        int total = 0;
        for (int i=1; i<10; i++){
            total += recursion4(k-1, s-i);
        }
        return total;
    }

    public static int recursion4(int k, int s) {
        if (k==0 && s==0)
            return 1;
        if (k==0 && s>0)
            return 0;
        if (s<0)
            return 0;
        int count = 0;
        for (int i=0; i<10; i++){
            count += recursion4(k-1, s-i);
        }
        return count;
    }

    public static int recursion5(int n) {
        if (n==0)
                return 0;
        return (n%10 + recursion5(n/10));
    }

    public static void main(String[] args) {

        System.out.println("Задание 2, числа от 1 до n");
        recursion2(5);
        System.out.println("Задание 3, числа от a до b");
        recursion3(16, 9);
        System.out.println("Задание 4, количество чисел с k цифрами, сумма которых s");
        System.out.println(countNumbers(3, 16));
        System.out.println("Задание 5, сумма цифр числа");
        System.out.println(recursion5(275));
    }
}
