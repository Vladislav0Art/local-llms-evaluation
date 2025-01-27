package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedGetUserData_keyNotFound_inMap_returnsNull {

    private class Attribute {
        public String get() {
            return null;
        }
    }

    private class AttributeBuilder {
        private int key;
        private String value;

        public void setKey(String key) {
            this.key = key;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Attribute build() {
            return new Attribute();
        }
    }

    @Test
    public void getUserData_keyNotFound_inMap_returnsNull() {
        Attributes attributes = new Attributes();
        assertThat(attributes.getUserData("test"), is(null));
    }

    private AttributeBuilder attributeBuilder(Attributes attributes) {
        return new AttributeBuilder();
    }
}

public class Attributes {

    private List<Attribute> map = new ArrayList<>();

    public void put(String key, String value) {
        map.add(new Attribute());
    }

    public Object get(Object key) {
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i).getClass().getDeclaredField("key").getBoolean(map.get(i).getClass().getDeclaredField("key"))) {
                return map.get(i);
            }
        }
        return null;
    }

    public Object getUserData(String key) {
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i).getClass().getDeclaredField("key").getBoolean(map.get(i).getClass().getDeclaredField("key"))) {
                return map.get(i);
            }
        }
        return null;
    }

    public static Object checkNotNull(Object value) {
        return value == null ? "null" : "not null";
    }
}

public class Main {

    private static Attributes attributes = new Attributes();

    public static void main(String[] args) {
        attributeBuilder(attributes).setKey("test");
        System.out.println(Attributes.checkNotNull(attributes.get("test")));
    }

    public static AttributeBuilder attributeBuilder(Attributes attributes) {
        return new AttributeBuilder();
    }

}