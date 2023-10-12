public class AppMain {
    public static final int SIZE = 3;
    // Desired output (two different examples, depending on what the constant is set to)...
    // SIZE = 3
    //   #============#
    //   |    <><>    |
    //   |  <>....<>  |
    //   |<>........<>|
    //   |<>........<>|
    //   |  <>....<>  |
    //   |    <><>    |
    //   #============#
    // SIZE = 4
    //   #================#
    //   |      <><>      |
    //   |    <>....<>    |
    //   |  <>........<>  |
    //   |<>............<>|
    //   |<>............<>|
    //   |  <>........<>  |
    //   |    <>....<>    |
    //   |      <><>      |
    //   #================#
    
    public static void main(String[] args) {
        drawTopBottom();
        drawMiddle();
        drawTopBottom();
    }

    public static void drawTopBottom() {
        System.out.print("#");
        for (int i = 0; i<4*SIZE; i++){
            System.out.print("=");
        }
            System.out.print('#');
        System.out.println();
    }
    public static void drawMiddle() {
        for (int i = 0; i < SIZE*3; ++i) {
            System.out.print("|");
            System.out.print("   <>..<>   ");
            System.out.println("|");
        }
    }
}
