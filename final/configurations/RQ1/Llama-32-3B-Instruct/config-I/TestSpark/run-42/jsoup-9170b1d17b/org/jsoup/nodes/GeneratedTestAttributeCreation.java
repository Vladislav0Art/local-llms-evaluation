package org.jsoup.nodes;

public class GeneratedTestAttributeCreation {

    private String name;
    private Object value;

    public Attribute(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public static class Attributes implements Map<String, Object>, Cloneable {
        // existing code
    }

    @Test
    public void testAttributeCreation() {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute("name", "John");
        assertTrue(attributes.containsKey(attribute.getName()));
    }

}