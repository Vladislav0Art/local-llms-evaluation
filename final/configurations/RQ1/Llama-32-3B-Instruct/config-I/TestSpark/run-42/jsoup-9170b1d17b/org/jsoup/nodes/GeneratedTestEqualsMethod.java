package org.jsoup.nodes;

public class GeneratedTestEqualsMethod {

    private String name;
    private Object value;

    public static class Builder {
        private String name;
        private Object value;

        public Builder(String name, Object value) {
            this.name = name;
            this.value = value;
        }

        public Attribute build() {
            return new Attribute(name, value);
        }
    }

    private Attribute(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public static class Attributes implements Map<String, Object>, Cloneable {
        // existing code
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}

public class TestAttribute {

    @Test
    public void testEqualsMethod() {
        Attribute attribute1 = new Attribute("name", "value");
        Attribute attribute2 = new Attribute("name", "value");
        assertTrue(attribute1.equals(attribute2));
    }

}