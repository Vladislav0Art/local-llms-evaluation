package ch.jalu.configme.configurationdata;

import org.junit.Test;

public class GeneratedTestGeneratePublicClass {

    public String publicField = "myValue";

    public void publicMethod() {
        System.out.println(publicField);
    }
}

class MyMethod {
    public String getMethodName() {
        return "myMethod";
    }

    public static class MyClass2 {
        private String publicField = "myValue";

        public String publicMethod() {
            return publicField;
        }
    }

    public static class MyClass3 {
        private String publicField = "myValue";

        public String getPublicField() {
            return publicField;
        }

        public void publicMethod() {
            System.out.println(publicField);
        }
    }
}

public class TestPublicClasses {

    @Test
    public void testGeneratePublicClass() {
        MyClass myClass = new MyClass();
        assertEquals("MyClass", myClass.getClass());
    }

}