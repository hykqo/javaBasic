package javaBasic.oop1;

public class ValueObjectMain {

    public static void main(String[] args) {
        ValueObject valueObject = new ValueObject();
        valueObject.add();
        valueObject.add();
        valueObject.add();
        System.out.println("final value=" + valueObject.value);
    }
}
