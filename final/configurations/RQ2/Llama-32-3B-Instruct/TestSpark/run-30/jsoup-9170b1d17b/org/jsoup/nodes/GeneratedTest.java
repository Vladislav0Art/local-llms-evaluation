package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.ParserSettings;
import org.jsoup.parser.ParseError;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class GeneratedTest {

    @Test
    public void getKeyNotFound_ReturnsEmptyString() {
        Attributes attributes = new Attributes();
        String result = attributes.getKey("nonExistent");
        assertEquals("", result);
    }

    @Test
    public void getIgnoreCaseKeyNotFound_ReturnsEmptyString() {
        Attributes attributes = new Attributes();
        String result = attributes.getIgnoreCase("nonExistent");
        assertEquals("", result);
    }

    @Test
    public void getNullValue_ReturnsNull() {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute();
        attribute.setValue(null);
        assertSame(attribute, attributes.get(attribute.getKey()));
    }

    @Test
    public void getUserDataNull_ReturnsEmptyMap() {
        Attributes attributes = new Attributes();
        Map<String, Object> result = attributes.getUserData(null);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void addNewKeyValues_ReturnsUpdatedAttributes() {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute("test", "value");
        attributes.add(attribute.getKey(), attribute.getValue());
        assertEquals(1, attributes.size());
    }

    @Test
    public void putExistingKeyValues_ReturnsUpdatedAttributes() {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute("test", "value");
        attributes.put(attribute.getKey(), attribute.getValue());
        assertEquals(1, attributes.size());
    }

    @Test
    public void removeKey_ReturnsEmptyMap() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Map<String, String> result = attributes.remove("key");
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void hasKeyNull_ReturnsFalse() {
        Attributes attributes = new Attributes();
        assertFalse(attributes.hasKey(null));
    }

    @Test
    public void hasIgnoreCaseKeyNull_ReturnsFalse() {
        Attributes attributes = new Attributes();
        assertFalse(attributes.hasIgnoreCase("nonExistent"));
    }

    @Test
    public void sizeZeroAttributes_ReturnsZero() {
        Attributes attributes = new Attributes();
        assertEquals(0, attributes.size());
    }

    @Test
    public void isEmptyAttributes_ReturnsTrue() {
        Attributes attributes = new Attributes();
        assertTrue(attributes.isEmpty());
    }

    @Test
    public void hasDeclaredValueForKeyNull_ReturnsFalse() {
        Attributes attributes = new Attributes();
        assertFalse(attributes.hasDeclaredValueForKey(null));
    }

    @Test
    public void sizeOneAttribute_ReturnsOne() {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute("test", "value");
        attributes.add(attribute.getKey(), attribute.getValue());
        assertEquals(1, attributes.size());
    }

    @Test
    public void putBooleanValue_ReturnsUpdatedAttributes() {
        Attributes attributes = new Attributes();
        attributes.put("key", true);
        assertEquals(1, attributes.size());
    }

    @Test
    public void addAllAttributesFromOtherAttribute_ReturnsUpdatedAttributes() {
        Attributes attributes1 = new Attributes();
        Attribute attribute1 = new Attribute("key1", "value1");
        Attributes attributes2 = new Attributes();
        Attribute attribute2 = new Attribute("key2", "value2");
        attributes2.addAll(attributes1);
        assertEquals(2, attributes2.size());
    }

    @Test
    public void iteratorReturnsOneElement() {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute("test", "value");
        attributes.add(attribute.getKey(), attribute.getValue());
        Iterator<Attribute> iterator = attributes.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(1, iterator.next().getKey());
    }

    @Test
    public void datasetReturnsMap() {
        Attributes attributes = new Attributes();
        Map<String, String> result = attributes.dataset();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void htmlEmptyString_ReturnsEmptyString() {
        Attributes attributes = new Attributes();
        StringBuilder builder = new StringBuilder();
        Document.OutputSettings settings = null;
        try {
            attributes.html(builder, settings);
            assertEquals("", builder.toString());
        } catch (IOException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void internalKeyNull_ReturnsEmptyString() {
        String result = Attributes.internalKey(null);
        assertEquals("", result);
    }

}

class Attribute {
    private final String key;
    private final String value;

    public Attribute(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

}