package ch.jalu.configme.configurationdata;

import java.lang.reflect.Method;

public class GeneratedTestPublicVoidMethod {

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
    public void testPublicVoidMethod() throws Exception {
        String result = (String) PublicClass.publicVoidMethod("a", "b");
        System.out.println(result);
    }
}

public class TestMap {
    private Map<String, Object> map;

    public void setUp() {
        this.map = new HashMap<>();
    }

}