import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1: ");
        int expensesOfMonth[] = {23000, 45000, 29000, 34000, 60000};
        int sum = 0;
        for (int i : expensesOfMonth) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        System.out.println("Task 2: ");
        int expensesOfMonth1[] = {43000, 29000, 32000, 22000, 34000};
        int maxExpensesOfWeek = 0;
        for (int i : expensesOfMonth1) {
            if (i >= maxExpensesOfWeek) {
                maxExpensesOfWeek = i;
            }
        }
        int minExpensesOfWeek = maxExpensesOfWeek;
        for (int i : expensesOfMonth1) {
            if (minExpensesOfWeek >= i) {
                minExpensesOfWeek = i;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpensesOfWeek + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + maxExpensesOfWeek + " рублей.");

        System.out.println("Task 3: ");
        int expensesOfMonth2[] = {33000, 28000, 22000, 43000, 34000};
        sum = 0;
        for (int i : expensesOfMonth2) {
            sum += i;
        }
        float averageExpensesOfWeek = (float) sum / expensesOfMonth2.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpensesOfWeek + " рублей.");

        System.out.println("Task 4: ");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0;i != reverseFullName.length - (1 + i); i++) {
            char symbolBehindI = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - (1 + i)];
            reverseFullName[reverseFullName.length - (1 + i)] = symbolBehindI;
        }
        System.out.println(Arrays.toString(reverseFullName));
    }
}