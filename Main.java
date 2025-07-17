package practice;
import java.util.Scanner;
class Start{
    public void circle(float f){
        System.out.println(3.14*f*f);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        Start obj1=new Start();
        obj1.circle(a);
    }
}
