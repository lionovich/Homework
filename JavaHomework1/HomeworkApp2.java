/**Java. Homework 2
 * 
 * @author Lionovich
 * @date 27.03.2021
 */

public class HomeworkApp2 {
    public static void main(String[] args) {
        System.out.println("\nTask 1\n");    // добавил, чтобы было удобнее в куче вывода распознать номер задания
        System.out.println(fromTenToTwenty(6, 5)); 
        System.out.println(fromTenToTwenty(-5, 22));
        System.out.println(fromTenToTwenty(12, 18));
        System.out.println("\nTask 2\n");
        positiveOrNegative(7);
        System.out.println("\nTask 3\n");
        System.out.println(ifNegative(-5));
        System.out.println(ifNegative(0)); // ноль считаем положительным
        System.out.println(ifNegative(5));
        System.out.println("\nTask 4\n");
        iterator("a burp is not an answer\n", 2);
        iterator("'non-flammable' is not a challenge\n", 3);
        iterator("i will not instigate revolution\n", 5);
        System.out.println("\nTask 5\n");
        System.out.println(leapYear(1772));
        System.out.println(leapYear(2016));
        System.out.println(leapYear(1966));
        System.out.println(leapYear(2122));
        System.out.println(leapYear(100));
        System.out.println(leapYear(400));
}

static boolean fromTenToTwenty(int a, int b) {
    return (a + b > 10 && a + b < 20);
}

static void positiveOrNegative(int c) {
    String result = (c >= 0? "Positive" : "Negative");    //в задании было написано что сам метод должен выводить текст в консоль, поэтому добавил переменную result
    System.out.println(result);
}

static boolean ifNegative(int d) {
    return (d < 0);  
}

static void iterator(String text, int e) {
    for (int f = 0; f < e; f++) {
        System.out.print(text);
    }
}

static boolean leapYear(int y) {
    return ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0);
}
}