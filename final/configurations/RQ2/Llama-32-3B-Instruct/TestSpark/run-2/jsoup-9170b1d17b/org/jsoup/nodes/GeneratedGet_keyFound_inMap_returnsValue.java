package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedGet_keyFound_inMap_returnsValue {

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
    public void get_keyFound_inMap_returnsValue() {
        Attributes attributes = new Attributes();
        attributeBuilder(attributes).setKey("test");
        assertEquals("test", attributes.get("test"));
    }

}