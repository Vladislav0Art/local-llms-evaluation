package org.jsoup.nodes;

public class GeneratedTestConstructor {

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
    public void testConstructor() {
        Attribute attribute = new Attribute("name", "John");
        assertEquals("John", attribute.getName());
    }

}