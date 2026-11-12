package mirea.lab2;

public class PhoneFormatter {

    public static String formatPhoneNumber(String input) {
        String countryCode;
        String mainNumber;

        if (input.startsWith("+")) {

            int numberLength = input.length();
            int codeLength = numberLength - 10;
            countryCode = input.substring(0, codeLength);
            mainNumber = input.substring(codeLength);

        } else if (input.startsWith("8")) {
            countryCode = "+7";
            mainNumber = input.substring(1);
        } else {
            return "Ошибка: неверный формат номера";
        }

        StringBuilder sb = new StringBuilder();
        sb.append(countryCode);
        sb.append(mainNumber.substring(0, 3)).append("-");
        sb.append(mainNumber.substring(3, 6)).append("-");
        sb.append(mainNumber.substring(6));

        return sb.toString();
    }

    public static void main(String[] args) {

        String phone1 = "+79175655655";
        String phone2 = "+104289652211";
        String phone3 = "89175655655";

        System.out.println("Исходный: " + phone1 + ", отформатированный: " + formatPhoneNumber(phone1));
        System.out.println("Исходный: " + phone2 + ", отформатированный: " + formatPhoneNumber(phone2));
        System.out.println("Исходный: " + phone3 + ", отформатированный: " + formatPhoneNumber(phone3));
    }
}