package javaBasic.construct;

public class MethodInitMain2 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        InitMember(member1, "user1", 15, 80);

        MemberInit member2 = new MemberInit();
        InitMember(member2, "user2", 16, 90);

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println("name : "+member.name + ", age : "+member.age + ", grade : "+member.grade);
        }
    }

    static void InitMember(MemberInit member, String name, int age, int grade){
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
