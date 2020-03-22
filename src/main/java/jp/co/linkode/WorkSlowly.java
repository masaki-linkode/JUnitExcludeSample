package jp.co.linkode;

public class WorkSlowly
{
    public boolean methodSlow() {
        try {
            Thread.sleep(5000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        return true;
    }
}
