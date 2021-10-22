public class Main {
    public static void main(java.lang.String[] args) {
        TestClassForConstructors testClassForConstructors = new TestClassForConstructors(100);
    }
}

class ParentClassForInitializations{
    private final int testField3 = method();
    static {
        System.out.println("It's parent's static initialization block");
    }

    {
        System.out.println("It's parent's initialization block");
    }
    ParentClassForInitializations(){
        System.out.println("It's parent constructor");
    }

    public static int method(){
        System.out.println("Inline parent initialization");
        return 1;
    }


}

class TestClassForConstructors extends ParentClassForInitializations{
    private int testField;
    private int testField2;

    {
        int testFiled = 3;
        System.out.println("Its initialization block");
    }

    //inline инициализация
    private final int testField3 = method();


    static {
        System.out.println("It's static initialization block");
    }

    public TestClassForConstructors(int testField) {
        System.out.println("Its constructor");
        this.testField = testField;
    }

    public TestClassForConstructors(int testField, int testField2) {
        this.testField = testField;
        this.testField2 = testField2;
    }

    public static int method(){
        System.out.println("Inline initialization");
        return 1;
    }
}
