public class navin extends soach{
    public static void main(String[] args) {
        int n=8;
        for(int i=0;i<n;i++)
        {
            Thread object = new Thread(new navin());
            object.run();
        }
    }
}
