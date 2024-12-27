package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetElementsContainingText {

    public static final String TAG = "tag";
}

public class Attribute {
    private String key;
    private Object value;

    public Attribute(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }
}

public class Element {

    private String tagName;
    private java.util.List<Attribute> attributes;

    public Element(String tagName) {
        this.tagName = tagName;
        this.attributes = new java.util.ArrayList<>();
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }

    public java.util.List<Attribute> getAttributes() {
        return attributes;
    }

    public void addAttr(String key, Object value) {
        attributes.add(new Attribute(key, value));
    }
}

public class GeneratedTest {

    @Test
    public void testGetElementsContainingText() {
        Element element = new Element();
        assertEquals(0, element.getElementsContainingText("text").size());
    }

}