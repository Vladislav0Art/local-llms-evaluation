package org.jsoup.safety;

import org.junit.Test;

public class GeneratedTestIsSafeAttributeWithInvalidValue {

    @Test
    public void testIsSafeAttributeWithInvalidValue() {
        // Test cases with invalid values (e.g. #abc, not a number)
        boolean[] expected = {false};

        for (int i = 0; i < expected.length; i++) {
            System.out.println("Test case " + (i + 1) + ":");
            Attribute attribute = new Attribute();
            attribute.setKey("test-key-" + i);
            attribute.setValue(i);

            String tagName = "all";
            Element element = new Element(tagName, "");
            boolean isAllowed = AttributeTest.isSafeAttribute(tagName, element, attribute);
            System.out.println("Is allowed for " + (i + 1) + ": " + (isAllowed == expected[i]));
        }
    }

    static class Element {
        String tagName;
        String attrKey;
        String attrValue;

        public Element(String tagName, String attrKey) {
            this.tagName = tagName;
            this.attrKey = attrKey;
        }

        public void setAttribute(String key, String value) {
            this.attrKey = key;
            this.attrValue = value;
        }
    }

    static class Attribute {
        String key;
        String value;

        public Attribute() {
        }

        public void setKey(String key) {
            this.key = key;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || getClass() != obj.getClass())
                return false;
            Attribute that = (Attribute) obj;
            return key.equals(that.key);
        }
    }

    static class ElementBuilder {
        String tagName;
        String attrKey;

        public ElementBuilder(String tagName, String attrKey) {
            this.tagName = tagName;
            this.attrKey = attrKey;
        }

        public void setAttribute(String key, String value) {
            this.attrKey = key;
            this.attrValue = value;
        }
    }

    static class AttributeBuilder {
        String key;
        String value;

        public AttributeBuilder() {
        }

        public void setKey(String key) {
            this.key = key;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || getClass() != obj.getClass())
                return false;
            AttributeBuilder that = (AttributeBuilder) obj;
            return key.equals(that.key);
        }
    }

}