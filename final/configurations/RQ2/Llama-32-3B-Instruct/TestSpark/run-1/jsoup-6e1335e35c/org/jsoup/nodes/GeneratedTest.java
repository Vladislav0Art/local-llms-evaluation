package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testElementCreation() {
        Element element = new Element();
        assertNotNull(element);
    }

    @Test
    public void testSetAndGetAttributes() {
        Element element = new Element();
        element.setAttribute("key", "value");
        assertEquals("value", element.getAttribute("key"));
    }
}

public class Element {

    private java.util.Map<String, String> attributes;

    public Element() {
        this.attributes = new java.util.HashMap<>();
    }

    public void setAttribute(String key, String value) {
        attributes.put(key, value);
    }

    public String getAttribute(String key) {
        return attributes.get(key);
    }
}

public class ElementFactory {

    public static Element createElement() {
        return new Element();
    }

}