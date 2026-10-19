package mirea.lab1;

public class Lab3 {
    public static void main (String[] args) {
        Double d1 = Double.valueOf(1.23);
        Double d2 = Double.valueOf("5.67");
        System.out.println("");
        System.out.println("");

        String s = "3.45";
        double d3 = Double.parseDouble(s);

        Double d4 = 7.89;
        int a = d4.intValue();
        byte b = d4.byteValue();
        short c= d4.shortValue();
        long l = d4.longValue();
        float f = d4.floatValue();
        double d = d4.doubleValue();

        System.out.println("int: " + a);
        System.out.println("byte: " + b);
        System.out.println("short: " + c);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);

        String d5 = Double.toString(3.14);
    }
}
