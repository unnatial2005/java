class Example {
    int number;
    String text;
    Example() {
        number = 0;
        text = "Default";
        System.out.println("Default Constructor called!");
    }
    Example(int num, String str) {
        number = num;
        text = str;
        System.out.println("Parameterized Constructor called!");
    }
    Example(Example obj) {
        number = obj.number;
        text = obj.text;
        System.out.println("Copy Constructor called!");
    }
    void display() {
        System.out.println("Number: " + number + ", Text: " + text);
    }
}
public class ConstructorExample {
    public static void main(String[] args) {
        Example obj1 = new Example();
        obj1.display();
        Example obj2 = new Example(42, "Hello, World!");
        obj2.display();
        Example obj3 = new Example(obj2);
        obj3.display();
    }
}

