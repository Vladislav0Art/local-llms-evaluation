package ch.jalu.configme.configurationdata;

import java.lang.reflect.Method;

public class GeneratedTestLinkedHashMapGet {

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
    public void testLinkedHashMapGet() throws NoSuchFieldException, IllegalAccessException {
        String value = (String) linkedMap.get("key1");
        assertEquals("value1", value);
    }

}