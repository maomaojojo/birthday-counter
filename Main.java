import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("生年月日を入力してください（YYYY-MM-DD）: ");
        String birthInput = scanner.nextLine();

        LocalDate birthDate = LocalDate.parse(birthInput);
        LocalDate today = LocalDate.now();

        // 生まれてから今日までの日数
        long totalDays = ChronoUnit.DAYS.between(birthDate, today);

        // 年齢計算
        Period period = Period.between(birthDate, today);
        int years = period.getYears();

        // 今年の誕生日
        LocalDate thisYearBirthday = birthDate.withYear(today.getYear());
        if (today.isBefore(thisYearBirthday)) {
            thisYearBirthday = thisYearBirthday.minusYears(1);
        }

        long daysSinceBirthday = ChronoUnit.DAYS.between(thisYearBirthday, today);

        System.out.println("あなたは生まれてから " + totalDays + " 日目です。");
        System.out.println(years + "歳 " + daysSinceBirthday + "日目です。");

        scanner.close();
    }
}
