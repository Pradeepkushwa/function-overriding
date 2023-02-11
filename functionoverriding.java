public class functionoverriding {
    void show(){
        System.out.println("HI");
    }
  static  class java extends functionoverriding{
        void show(){
            System.out.println("hello");
        }
    }
    public static void main(String[] args) {
        java f=new java();
        f.show();

    }
    
}
