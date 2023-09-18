public class DecompositionMain {
    public static void main(String[] args) {
        SequenceA();
        SequenceB();
        SequenceC();
        SequenceB();
        SequenceA();
    }


public static void SequenceA(){
    System.out.println("   /\\" );
    System.out.println("  /  \\" );
    System.out.println(" /    \\" );    
}
public static void SequenceB(){
    System.out.println("+------+" );
    System.out.println("|      |" );
    System.out.println("|      |" );
    System.out.println("+------+" );
}
public static void SequenceC(){
    System.out.println("|UNITED|" );
    System.out.println("|STATES|" );
}
}