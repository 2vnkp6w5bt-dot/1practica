package mirea.lab1;
public class TestSeasons {

    public static void printilove(Seasons season) {
        switch (season) {
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
        }
    }

    public static void main (String[] args) {
        Seasons favourite = Seasons.SPRING;
        System.out.println(favourite);
        System.out.println(favourite.getDescription());
        System.out.println(favourite.getMeanTemp());

        for (Seasons s: Seasons.values()){
            System.out.printf("Время года: %s, средняя температура: %d, описание: %s%n",
                    s, s.getMeanTemp(), s.getDescription());
        }
    }
}
