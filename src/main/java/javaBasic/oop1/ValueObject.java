package javaBasic.oop1;

public class ValueObject {
    int value;

    void add(){
        this.value++;
        System.out.println("num increase value=" + this.value);
    }
}
