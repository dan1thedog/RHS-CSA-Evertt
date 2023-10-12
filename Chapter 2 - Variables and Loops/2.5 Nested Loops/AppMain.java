public class AppMain {
    public static void main (String args[]){
        Method1();
        Method2();
    }
    
    public static void Method1() {
        for (int y = 1; y<=6; y++) {
            for ( int x = 1; x<=y; x++){
                System.out.print (y);
            }
            System.out.println();
        }  
    }

}


public static void Method2(){
    for(int y=1; y<=5; y++){
        for(int x=0; x<=4-y; x++){
            System.out.print ("");
        }
        System.out.println(y);
    }

}
