package org.jsoup.safety;

public class GeneratedTestIsValidAnchor {

    private String tag;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}

public class Attribute extends Element {
    private String key;
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

public class Attributes extends Element {
    private Map<String, Attribute> attributes = new HashMap<>();

    public Map<String, Attribute> getAttributes() {
        return attributes;
    }

    public void setAttribute(Attribute attribute) {
        attributes.put(attribute.getKey(), attribute);
    }

    public boolean hasAttribute(String key) {
        return attributes.containsKey(key);
    }
}

public class ElementTest {

    @Test
    public void testIsValidAnchor() {
        String value = "#anchor";
        Assert.assertTrue(Element.isValidAnchor(value));
        Assert.assertFalse(Element.isValidAnchor("invalid anchor"));
    }

}