package org.jsoup.nodes;

public class GeneratedTestCloneMethod {

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
    public void testCloneMethod() throws CloneNotSupportedException {
        Attribute attribute = new Attribute("name", "value");
        Attribute clonedAttribute = (Attribute) attribute.clone();
        assertNotNull(clonedAttribute);
        assertEquals("value", clonedAttribute.getValue());
    }

}