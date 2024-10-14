package overloading;

public class OverloadingDemo {

    private int a;

    public OverloadingDemo(){
        System.out.println("constructor without parameters");
    }
    public OverloadingDemo(int a){
       this.a=a;
    }

    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c,int d){
        return a+b+c+d;
    }

    public void add(int a,int b,int c){
        int result=a+b+c;
        System.out.println("Addition :"+result);
    }


    public static void main(String[] args) {
        OverloadingDemo obj=new OverloadingDemo();
        obj.add(1,2,3);
        int result2=obj.add(1,2,3,4);
        int result3=obj.add(1,2);



    }

}
