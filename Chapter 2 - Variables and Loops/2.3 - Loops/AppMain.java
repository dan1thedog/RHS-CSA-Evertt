public class AppMain {
    public static void main(String[] args) {
        loop1();
        loop2();
        loop3();
        loop4();
        loop5();
        loop6();
    }

    public static void loop1() {
        
        for(int i = 0; i < 5; i++) {
	        System.out.print(2+ 5*i + " " );
        }
        System.out.println();
    }

    public static void loop2() {
        
        for(int i = 0; i < 5; i++) {
	        System.out.print(4+3*i + " " );
        }
        System.out.println();
    }

    public static void loop3() {
        
        for(int i = 0; i < 6; i++) {
	        System.out.print( 6+3*i + " " );
        }
        System.out.println();
    }

    public static void loop4() {
        
        for(int i = 0; i < 6; i++) {
	        System.out.print(-15+8*i + " " );
        }
        System.out.println();
    }

    public static void loop5() {
        
        for(int i = 0; i < 6; i++) {
	        System.out.print( 10-i + " " );
        }
        System.out.println();
    }

    public static void loop6() {
        
        for(int i = 0; i < 3; i ++) {
	        System.out.print( 6+2*i + " " );
        }
        System.out.println();
    }
}
