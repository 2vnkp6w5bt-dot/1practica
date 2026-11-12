package mirea.lab2;

public class TestAddress {
    public static void main(String[] args) {

        String addr1 = " Россия ,  Московская область ,  Москва ,  Ленина ,  10 ,  2 ,  55 ";
        System.out.println("Исходная строка: " + addr1);
        System.out.println(AddressParser.parseWithSplit(addr1));

        String addr2 = "Россия; Московская область. Москва-Ленина;10.2,55";
        System.out.println("\nИсходная строка: " + addr2);
        System.out.println(AddressParser.parseWithStringTokenizer(addr2));

        String addr3 = "Беларусь, Минская область, Минск, Победы, 5";
        System.out.println("\nИсходная строка: " + addr3);
        System.out.println(AddressParser.parseWithSplit(addr3));

        String addr4 = "Казахстан.Алматинская область.Алматы.Абая.15.1.100";
        System.out.println("\nИсходная строка: " + addr4);
        System.out.println(AddressParser.parseWithStringTokenizer(addr4));
    }
}