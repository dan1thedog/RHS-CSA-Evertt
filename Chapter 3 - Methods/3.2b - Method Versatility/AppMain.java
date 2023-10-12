public class AppMain {
    public static void main(String[] args) {
       
        for (int i=0; i<5; i++) {
               System.out.print(randomNumber(100) + " ");
        }
                System.out.println();
        
        for (int i=0; i<5; i++) {
               System.out.print(randomNumber(100,500) + " ");
        }   
    }     
       
    
    
    // Put your functions here...
    public static int randomNumber (int maxValue) {
            return (int) ((double)Math.random()*maxValue);
    }
        
    public static int randomNumber (int minValue, int maxValue) {
            return (int) ((int)( maxValue -  minValue)*Math.random() + minValue);

    }     
    // Function 1 should: return a value with a maximum of a provided value, [0,𝑚𝑎𝑥𝑉𝑎𝑙𝑢𝑒).
    // Function 2 should: should return a value between two provided doubles, [𝑚𝑖𝑛𝑉𝑎𝑙𝑢𝑒,𝑚𝑎𝑥𝑉𝑎𝑙𝑢𝑒).
}
