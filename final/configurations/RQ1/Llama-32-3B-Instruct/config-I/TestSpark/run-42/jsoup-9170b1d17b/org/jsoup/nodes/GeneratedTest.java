package org.jsoup.nodes;

public class GeneratedTest {

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

    public static class Attributes implements Map<String, Object>, Cloneable {
        // existing code
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }

    public static class Attribute {
        private String name;
        private Object value;

        public Attribute(String name, Object value) {
            this.name = name;
            this.value = value;
        }
    }
}

public class TestAttribute {

}