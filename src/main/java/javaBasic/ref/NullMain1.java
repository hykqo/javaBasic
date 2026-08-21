package javaBasic.ref;

public class NullMain1 {

    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data=" + data);
        data = new Data();
        System.out.println("2. data=" + data);
        data = null; //다시 null을 입력할 경우 2번에서 생성한 인스턴스는 접근이 불가하다.
        System.out.println("3. data=" + data);
    }
}
