package org.jsoup.safety;

public class GeneratedTestIsSafeAttribute_NoEnforcedAttributes_AttributeFound_ReturnsTrue {

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
    public void testIsSafeAttribute_NoEnforcedAttributes_AttributeFound_ReturnsTrue() {
        Element element = new Element();
        element.setTag("test");
        Attributes attrs = new Attributes();
        Attribute attr = new Attribute();
        attr.setKey("key");
        attr.setValue("value");
        attrs.setAttribute(attr);
        Assert.assertTrue(Element.isSafeAttribute("test", element, null));
    }

}