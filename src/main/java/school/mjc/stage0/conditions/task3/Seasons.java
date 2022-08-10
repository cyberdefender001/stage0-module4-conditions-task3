package school.mjc.stage0.conditions.task3;

public class Seasons {
    public static void tellTheSeasonByMonthNumber(int month) {
        switch(month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
        }
        default: {
            System.out.println("wrong number!");
        }
    }
    public static void main(String[] args) {
        tellTheSeasonByMonthNumber(6);
    }
}
