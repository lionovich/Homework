public class HomeworkApp {
    public static void main(String[] args) {
        PrintThreeWords();
        checkSumSign();
        printColor();
    }
    public static void PrintThreeWords() {
        System.out.println("Apple");
        System.out.println("Orange");
        System.out.println("Banana");
    }
    public static void checkSumSign() {
        int a = 15;
        int b = 6;
        if (a+b >= 0)
            System.out.println("Positive");
        else
            System.out.println("Negative");
    }
    public static void printColor() {
        int value = 2543;
        if (value <= 0) 
            System.out.println("Red");
        if (value > 100)
            System.out.println("Green");
        else
            System.out.println("Yellow");
    }
} 