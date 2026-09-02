package javaBasic.construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade){
        //name = name 으로 하면 변수는 가까운 우선순서를 가지기 때문에 참조받은 변수를 사용하게된다.
        //this = 자기자신의 인스턴스를 지칭.
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
