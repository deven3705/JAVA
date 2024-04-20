public class soach extends Thread {
    public void run(){
        try{
            System.out.println("hi current :: "+Thread.currentThread());
            System.out.println("hi current threadId:: "+Thread.currentThread().threadId());
            System.out.println("hi current ThreadGroup:: "+Thread.currentThread().getThreadGroup());
            System.out.println("hi current priority:: "+Thread.currentThread().getPriority());
        }
        catch(Exception e){
            System.out.println("durgatna : "+e);
        }
        finally{
            System.out.println("Total : "+Thread.activeCount());
        }
    }

}