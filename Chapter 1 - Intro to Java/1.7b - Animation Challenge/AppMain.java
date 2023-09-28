import java.util.concurrent.TimeUnit;

public class AppMain {
    public static void duck(){
        System.out.print("\033[33m"); // Yellow
        System.out.println("     _");
        System.out.println("    ( )>");
        System.out.println(" \\```` )");
        System.out.println("  ``````");
    }
    public static void main(String[] args) {
        // TODO: Replace the sample code provide here with your own animation
        duck();
        endFrame();
        
        
        // END of sample animation code
        resetColor();
    }

    /* Tips...
     *  - After you've draw your 'scene' for the frame, call delayAndClearForNextFrame()
     *  - If you'd like to use colors, you can use this...
     *      System.out.println("\033[0m");  // RESET TO DEFAULT COLOR
     *      System.out.println("\033[31m"); // RED
     *      System.out.println("\033[32m"); // GREEN
     *      System.out.println("\033[33m"); // YELLOW
     *      System.out.println("\033[34m"); // BLUE
     *      System.out.println("\033[35m"); // MAGENTA
     *      System.out.println("\033[36m"); // CYAN
     *      System.out.println("\033[37m"); // WHITE
     */

    /* Call this function when you are done drawing/printing your "Frame" of animation.
     *  It will leave your Ascii art on the screen for a short time
     *    and then clear the console so that you can print out your next frame.
     *  If you call endFrame(), that will default to a 250ms (or 0.25 second) delay.
     *  If you call endFrame(100), you control the delay time (this example is 100ms).
     */
    public static void endFrame() {
        endFrame(250);
    }
    public static void endFrame(int delayMilliSeconds) {  
        // Delay a for a short time (leave it on the screen)
        try {
            Thread.sleep(delayMilliSeconds);
        } 
        catch (Exception ex) {
        }

        // Clear the console
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    } 
    public static void resetColor() {
        System.out.print("\033[0m");
    }
}
