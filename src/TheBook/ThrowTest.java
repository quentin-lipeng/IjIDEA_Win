package TheBook;

import java.util.Scanner;

public class ThrowTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        if(i == 0){
            try {
                throw new Exception();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
