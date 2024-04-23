package java_programming;

class Parent {
    int compute(int num) {
        if(num <= 1) 
            return num;
        return compute(num-1) + compute(num-2);
    }
}

class Child extends Parent {
    int compute(int num) {
        if(num <= 1) return num;
        return compute(num-1) + compute(num-3);
    }
}

/**
 * 2023.03 11번
 */
public class test1 {
    public static void main(String[] args) {
        Parent obj = new Child();
        System.out.println(obj.compute(7));
    }
}
