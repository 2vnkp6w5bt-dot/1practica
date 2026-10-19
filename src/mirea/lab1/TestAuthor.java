package mirea.lab1;

public class TestAuthor {
    public static void main (String[] args) {
        Author person = new Author("Василиса", "vasilisa@gmail", 'f');
        System.out.println(person.toString());
        System.out.println(person.getGender());
        person.setEmail("vasilisa@mirea");
        System.out.println(person.getEmail());
    }
    }

