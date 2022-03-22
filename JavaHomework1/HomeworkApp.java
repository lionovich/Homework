class HomeworkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    static void printThreeWords() {
        System.out.println("Apple");
        System.out.println("Orange");
        System.out.println("Banana");
    }
    static void checkSumSign() {
        int a = 15;
        int b = 6;
        if (a+b >= 0)
            System.out.println("SumPositive");
        else
            System.out.println("SumNegative");
    }
    static void printColor() {
        int value = 2543;
        if (value <= 0) 
            System.out.println("Red");
        if (value > 100)
            System.out.println("Green");
        else
            System.out.println("Yellow");
    }
    static void compareNumbers() {
        int a = 43;
        int b = 34;
        if (a>=b)
            System.out.println("a>=b");
        else
            System.out.println("b>=a");
    }
} 