package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedTest {

    @Test
    public void testGet() {
        Attributes attributes = new Attributes();
        assertEquals("test", attributes.get("key"));
    }

    @Test
    public void testCheckNotNull() {
        assertEquals("test", Attributes.checkNotNull("test"));
        assertNull(Attributes.checkNotNull(null));
    }

    @Test
    public void testPut() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals("value", attributes.get("key"));
    }

    @Test
    public void testPutIgnoreCase() {
        Attributes attributes = new Attributes();
        attributes.putIgnoreCase("Key", "Value");
        assertEquals("Value", attributes.getIgnoreCase("Key"));
    }

    @Test
    public void testGetUserData() {
        Attributes attributes = new Attributes();
        Object userData = "test";
        attributes.putUserData("key", userData);
        assertEquals(userData, attributes.getUserData("key"));
    }

    @Test
    public void testAdd() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        assertEquals("value", attributes.get("key"));
    }

    @Test
    public void testRemove() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        attributes.remove("key");
        assertNull(attributes.get("key"));
    }

    @Test
    public void testHasKey() {
        Attributes attributes = new Attributes();
        assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void testHasDeclaredValueForKey() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertTrue(attributes.hasDeclaredValueForKey("key"));
    }

    @Test
    public void testSize() {
        Attributes attributes = new Attributes();
        assertEquals(0, attributes.size());
    }

    @Test
    public void testIsEmpty() {
        Attributes attributes = new Attributes();
        assertTrue(attributes.isEmpty());
    }

    @Test
    public void testNormalize() {
        Document document = new Element("html").appendText("test");
        Attributes attributes = document.attributes();
        assertEquals(1, attributes.normalize());
    }

    @Test
    public void testDeduplicate() {
        ParseSettings settings = new ParseSettings();
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        int result = attributes.deduplicate(settings);
        assertTrue(result == 1 || result == 0);
    }

    @Test
    public void testGetHtml() {
        Document document = new Element("html").appendText("test");
        Attributes attributes = document.attributes();
        assertEquals("<html>test</html>", attributes.html());
    }
}

class MockAttribute implements Attribute {
    private String key;

    public MockAttribute(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public String getValue() {
        return "test";
    }

}