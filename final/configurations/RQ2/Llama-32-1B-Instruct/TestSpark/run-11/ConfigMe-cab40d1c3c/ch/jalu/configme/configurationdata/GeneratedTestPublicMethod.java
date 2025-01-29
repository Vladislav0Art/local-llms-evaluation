package ch.jalu.configme.configurationdata;

import java.lang.reflect.Method;

public class GeneratedTestPublicMethod {

    public int publicMethod() {
        return 10;
    }

    public void publicVoidMethod() {
    }
}

class PublicMethod {
    public String publicMethod(String a, String b) {
        return a + " " + b;
    }

    public Object publicVoidMethod(String a, String b) {
        return null;
    }
}

public class TestPublicClass {

    @Test
    public void testPublicMethod() throws Exception {
        PublicClass.publicMethod();
        Method method = PublicClass.class.getMethod("publicVoidMethod");
        Object result = method.invoke(null, "a", "b");
        System.out.println(result);
    }

}