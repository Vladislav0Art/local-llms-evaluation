package org.jsoup.nodes;

public class GeneratedTestHashCodeMethod {

    private String name;
    private Object value;

    public Attribute(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public static class Attributes implements Map<String, Object>, Cloneable {
        // existing code
    }
}

public class TestAttribute {

    @Test
    public void testHashCodeMethod() {
        Attribute attribute = new Attribute("name", "value");
        int hashCode = attribute.hashCode();
        assertEquals(1, hashCode);
    }

}