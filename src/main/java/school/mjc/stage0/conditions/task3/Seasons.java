package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (month < 3 || month == 12) {
            System.out.println("Winter");
        } else if (month <= 5) {
            System.out.println("Spring");
        } else if (month<=8) {
            System.out.println("Summer");
        } else if (month<=11) {
            System.out.println("Autumn");
        } else if (month>13) {
            System.out.println("wrong number!");
        }

    }
}
