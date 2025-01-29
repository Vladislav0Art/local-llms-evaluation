package ch.jalu.configme.configurationdata;

import java.lang.reflect.Method;

public class GeneratedTestMapGet {

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
    public void testMapGet() throws NoSuchFieldException, IllegalAccessException {
        String value = (String) map.get("key1");
        assertEquals("value1", value);
    }
}

public class TestLinkedHashMap {
    private LinkedHashMap<String, Object> linkedMap;

    public void setUp() {
        this.linkedMap = new LinkedHashMap<>();
    }

}