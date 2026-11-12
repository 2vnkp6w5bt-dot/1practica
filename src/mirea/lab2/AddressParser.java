package mirea.lab2;

import java.util.StringTokenizer;

public class AddressParser {

    public static Address parseWithSplit(String addressStr) {
        String[] parts = addressStr.split(",");

        String country = parts.length > 0 ? parts[0].trim() : "";
        String region = parts.length > 1 ? parts[1].trim() : "";
        String city = parts.length > 2 ? parts[2].trim() : "";
        String street = parts.length > 3 ? parts[3].trim() : "";
        String house = parts.length > 4 ? parts[4].trim() : "";
        String building = parts.length > 5 ? parts[5].trim() : "";
        String apartment = parts.length > 6 ? parts[6].trim() : "";

        return new Address(country, region, city, street, house, building, apartment);
    }

    public static Address parseWithStringTokenizer(String addressStr) {
        StringTokenizer tokenizer = new StringTokenizer(addressStr, ",.;");

        String country = tokenizer.hasMoreTokens() ? tokenizer.nextToken().trim() : "";
        String region = tokenizer.hasMoreTokens() ? tokenizer.nextToken().trim() : "";
        String city = tokenizer.hasMoreTokens() ? tokenizer.nextToken().trim() : "";
        String street = tokenizer.hasMoreTokens() ? tokenizer.nextToken().trim() : "";
        String house = tokenizer.hasMoreTokens() ? tokenizer.nextToken().trim() : "";
        String building = tokenizer.hasMoreTokens() ? tokenizer.nextToken().trim() : "";
        String apartment = tokenizer.hasMoreTokens() ? tokenizer.nextToken().trim() : "";

        return new Address(country, region, city, street, house, building, apartment);
    }
}