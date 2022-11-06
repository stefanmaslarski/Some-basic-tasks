import java.util.Scanner;

public class VideoDuration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String duration = scanner.nextLine();
        int totalHours = 0;
        int totalMinutes = 0;
        int movies = 0;
        while (!duration.equals("End") ) {
            String[] splitted = duration.split(":");
            int hours = Integer.parseInt(splitted[0]);
            int minutes = Integer.parseInt(splitted[1]);
            totalHours += hours;
            totalMinutes += minutes;
            if (totalMinutes >=60){
                totalHours ++;
                totalMinutes = totalMinutes - 60;
            }

            duration = scanner.nextLine();
        }
        System.out.printf("%d:%02d", totalHours, totalMinutes);
    }
}
