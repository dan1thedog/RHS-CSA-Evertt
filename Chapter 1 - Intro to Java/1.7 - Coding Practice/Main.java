public class Main {
    public static void main(String[] args) {
        // You can add new functions to this class, but
        //  do not modify this function (main).
        System.out.println("--- Exercise 5 ---");
        exercise5();
        System.out.println("\n--- Exercise 6 ---");
        exercise6();
        System.out.println("\n--- Exercise 7 ---");
        exercise7();
        System.out.println("\n--- Exercise 8 ---");
        exercise8();
        System.out.println("\n--- Exercise 9 ---");
        exercise9();
        System.out.println("\n--- Exercise 10 ---");
        exercise10();
    }
public static void exercise5() {
        System.out.println("A \"quoted\" String is");
        System.out.println("'much'better if you learn");
        System.out.println("the rules of \"escape sequences.\"");
        System.out.println("Also, \"\" represents an empty String.");
        System.out.println("Don't forget: use \\\" instead of \" !");
        System.out.println("'' is not the same as \"");

    }

    public static void exercise6() {
        System.out.println("System.out.println(\"Hello World!\")");
    }

    public static void q7Code() {
        System.out.println("There's one thing every coder must understand:");
        System.out.println("The System.out.println command.");
    }

    public static void exercise7() {
        q7Code();
        System.out.println();
        q7Code();
    }

    public static void exercise8() {
        System.out.println("//////////////////////");
        System.out.println("|| Victory is mine ||");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("|| Victory is mine ||");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("|| Victory is mine ||");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("|| Victory is mine ||");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("|| Victory is mine ||");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");

    }
    public static void printTop() {
       System.out.println("  _________");
       System.out.println(" /         \\");
       System.out.println("/           \\");
    }
    public static void printDivider() {
        System.out.println("-\"-'-\"-'-\"-'-");
    }
    public static void printBottom() {
       System.out.println("\\           /");
       System.out.println(" \\         /");
       System.out.println("  ---------");
    }
    public static void exercise9() {
       printTop();
       printDivider();
       printBottom();
    }

    public static void exercise10() {
       printTop();
       printBottom();
       System.out.println();
       printDivider();
       System.lineSeparator();
       printTop();
       printBottom();
    }
}
