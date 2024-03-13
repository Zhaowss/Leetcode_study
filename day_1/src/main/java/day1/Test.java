package day1;

//时间复杂度和空间复杂度

public class Test {
    public static void main(String[] args) {
        process1();


        process2();
    }
    public static void process1(){
      int N=100;
      int a=0;

      for (int i =0; i<N;i++){
          a=1+23;
          a=12+23;
          a=13+23;
      }
    }

    public static void process2(){

        int N=100;
        int a=0;

        for (int i =0; i<N;i++){

            a=1 | 2;
            a=1 ^ 4;
            a=2 & 3;
        }
    }
}
