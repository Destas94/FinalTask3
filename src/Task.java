import java.text.DecimalFormat;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текущий курс доллара (руб. за 1 долл.): ");
        double dollarCurs = in.nextDouble();
        System.out.println("Введите количество рублей: ");
        double rub = in.nextDouble();
        double Dollar = rub/dollarCurs;
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("Сумма в долларах по курсу "+ dollarCurs + ": " + df.format(Dollar));

    }
}
