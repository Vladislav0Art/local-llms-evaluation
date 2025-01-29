package ch.jalu.configme.configurationdata;

import java.lang.reflect.Method;

public class GeneratedTestLinkedHashMapPutAll {

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
    public void testLinkedHashMapPutAll() throws NoSuchFieldException, IllegalAccessException {
        for (int i = 0; i <= 10; i++) {
            linkedMap.put("key" + i, "value" + i);
        }
        assertEquals(11, linkedMap.size());
    }

}