package javaBasic.class1;

public class ClassStart5 {

    public static void main(String[] args) {
        //student1  메모리 할당
        Student student1 = new Student(); //x001
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        //student2  메모리 할당
        Student student2 = new Student(); //x002
        student1.name = "학생2";
        student1.age = 16;
        student1.grade = 80;

        //배열 생성 - student변수를 2개 보관할 수 있는 사이즈의 2개 배열을 만든다.(초기엔 null)
        //자바에서 대입은 항상 변수에 들어 있는 값을 복사한다.
        Student[] students = new Student[]{student1, student2}; //x005=x001, x006=x002

        for (Student student : students){
            // 배열 접근 -> x005 -> x001 -> 메모리 적재된 데이터 추출
            System.out.println("이름: " + student.name + " 나이: "+student.age + " 성적:" + student.grade);
        }
    }
}
