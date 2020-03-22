package jp.co.linkode;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public boolean method01() {
        return true;
    }

    public boolean method02() {
        return true;
    }

    public boolean mtehodSlow01() {
        try {
            Thread.sleep(5000);
        } catch(InterruptedException e){
            e.printStackTrace();
        } 
        return true;
    }
}
