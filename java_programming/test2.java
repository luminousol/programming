package java_programming;

/**
 * test2
 * 2023.03 13번
 */
public class test2 {

    public static void main(String[] args) {
        Person obj = new Person("EJ");
        obj.print();
    }
}

class Person {
    private String name;
    public Person(String val) {
        name = val;
    }
    // public static String get() {    
    // 수정 구간 -> static 메서드는 클래스의 인스턴스 없이 호출될 수 있기 때문에 인스턴스에 속한 변수 사용 불가
    public String get(){
        return name;    // error 발생 구간
    }
    public void print() {
        System.out.println(name);
    }
}