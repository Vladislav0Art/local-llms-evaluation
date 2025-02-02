package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestTestValidProtocol {

    @Test
    public void testTestValidProtocol() {
        Config config = new Config();
        Element element = new Element(All, "");
        Attribute attribute = new Attribute("src", "#");

        assertTrue(config.testValidProtocol(element, attribute, new HashSet<>())); // anchor link

        attribute.setKey("href");
        attribute.setValue("http://example.com/script.js");

        config.setPreserveRelativeLinks(true);
        assertFalse(config.testValidProtocol(element, attribute, new HashSet<>())); // relative url
    }
}

class Element {
    private String tagName;
    private Attributes attributes;

    public Element(String tagName, String html) {
        this.tagName = tagName;
        this.attributes = new Attributes();
    }

    public void setAttribute(Attribute attribute) {
        this.attributes.put(attribute.getKey(), attribute);
    }

    public String absUrl(String key) {
        return "http://" + tagName + "/" + key; // mock implementation
    }
}

class Attribute extends TypedValue {
    private final String key;
    private final String value;

    public Attribute(String key, String value) {
        super(value);
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}

class Attributes extends TypedValue {
    private final Map<String, TypedValue> attributes = new HashMap<>();

    public void put(String key, TypedValue value) {
        attributes.put(key, value);
    }

}