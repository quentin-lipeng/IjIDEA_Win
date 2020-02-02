package TheBook;

import java.util.Scanner;

public class DiyException extends Exception{
    public static void main(String[] args) throws DiyException{
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        if(i == 1)  throw new DiyException();
    }

    public DiyException() {
        super();
    }

    public DiyException(String message) {
        super(message);
    }

    public DiyException(String message, Throwable cause) {
        super(message, cause);
    }

    public DiyException(Throwable cause) {
        super(cause);
    }

}
