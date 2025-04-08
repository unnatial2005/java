public class Cal {
    int a = 10;
    int b = 5;
    public void add() {
        System.out.println(a + b);
    }
    public void sub() {
        System.out.println(a - b);
    }
    public void mul() {
        System.out.println(a * b);
    }
    public void div() {
        if (b != 0) {
            System.out.println(a / b);
        } else {
            System.out.println("Division by zero is undefined.");
        }
    }
    public static void main(String[] args) {
        Cal c = new Cal();
        c.add();
        c.sub();
        c.mul();
        c.div();
    }
}
