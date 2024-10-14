package p1.p2;

public class ThisDemo {

    @Override
    public String toString() {
       return "ThisDemo";
    }

    public void f1(){
        ThisDemo obj=new ThisDemo();
        System.out.println(obj);
        System.out.println(this);
   }


    public static void main(String[] args) {
        ThisDemo obj = new ThisDemo();
        obj.f1();
    }

}
