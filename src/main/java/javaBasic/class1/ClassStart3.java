package javaBasic.class1;

public class ClassStart3 {

    public static void main(String[] args) {
        //student1  메모리 할당
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        //student2  메모리 할당
        Student student2 = new Student();
        student1.name = "학생2";
        student1.age = 16;
        student1.grade = 80;

        System.out.println(student1);
        System.out.println(student2);

        /**
         * 객체 값 대입
         * */
//        1. 객체 선언
//        Student student2 = new Student();
//        2. stdent1 객체의 name 멤버 변수에 값 대입
//        student1.name = "학생1";
//        3. 변수에 있는 참조값을 통해 실제 객체에 접근, 해당 객체의 name 멤버 변수에 값 대입
//        x001.name = "학생1";

        /**
         * 객체 값 읽기
         * */
//        1. 객체 값 읽기
//        System.out.println("이름" + student1.name);
//        2. 변수에 있는 참조값을 통해 실제 객체에 접근하고, NAME 멤버 변수에 접근한다.
//        System.out.println("이름" + x001.name);
//        3. 객체의 멤버 변수의 값을 읽어옴
//        System.out.println("이름" + "학생1");

        System.out.println("이름: " + student1.name + " 나이: "+student1.age + " 성적:" + student1.grade);
        System.out.println("이름: " + student2.name + " 나이: "+student2.age + " 성적:" + student2.grade);
    }
}
