package javaBasic.ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;
        System.out.println(dataA.value); //10
        System.out.println(dataB.value); //10

        //a 변경
        dataA.value = 20;
        System.out.println("change a=20");
        System.out.println("a="+dataA.value);  //20
        System.out.println("b="+dataB.value);  //20

        //b 변경
        dataB.value = 30;
        System.out.println("change b=30");
        System.out.println("a="+dataA.value);  //30
        System.out.println("b="+dataB.value);  //30

        //주소값이 동일.
        System.out.println(dataA == dataB); //true
    }
}
