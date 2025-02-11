package org.jsoup.nodes;

public class GeneratedTestBuilder {

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
    public void testBuilder() {
        Attribute.Attribute.Builder builder = new Attribute.Attribute.Builder("name", "value");
        Attribute attribute = builder.build();
        assertNotNull(attribute);
        assertEquals("value", attribute.getValue());
    }

}