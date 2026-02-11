import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("生年月日を入力してください（YYYY-MM-DD）: ");
        String input = scanner.nextLine();

        // 文字列を日付に変換
        LocalDate birthDate = LocalDate.parse(input);

        // 今日の日付
        LocalDate today = LocalDate.now();

        // 生まれてからの日数を計算
        long days = ChronoUnit.DAYS.between(birthDate, today);

        System.out.println("あなたは生まれてから " + days + " 日目です。");

        scanner.close();
    }
}
