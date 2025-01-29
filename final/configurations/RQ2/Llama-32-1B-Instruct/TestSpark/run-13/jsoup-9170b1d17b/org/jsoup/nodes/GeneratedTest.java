package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Attributes;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    private Attributes attributes;

    @BeforeEach
    public void setup() {
        Document document = new Document();
        attributes = new Attributes(document);
    }

    @Test
    public void testGet_WithNonNullableValueReturnsEmptyString() {
        Attribute attribute = attributes.add("test", "value");
        assertEquals("", attribute.getValue());
    }

    @Test
    public void testGet_WithNonNullValueReturnsOriginalAttribute() {
        Attribute attribute = attributes.add("test", "value");
        String originalValue = attribute.getValue();
        assertEquals(originalValue, new Object[]{attribute, "value"});
    }

    @Test
    public void testGet_WithNullValueReturnsNull() {
        Attribute attribute = attributes.add("test", null);
        assertEquals(null, attribute.getValue());
    }

    @Test
    public void testGetIgnoreCase_WithNonNullableValueReturnsEmptyString() {
        Attribute attribute = attributes.add("test", "value");
        assertEquals("", attribute.getValue());
    }

    @Test
    public void testGetIgnoreCase_WithNonNullValueReturnsOriginalAttribute() {
        Attribute attribute = attributes.add("test", "value");
        String originalValue = attribute.getValue();
        assertEquals(originalValue, new Object[]{attribute, "value"});
    }

    @Test
    public void testGetIgnoreCase_WithNullValueReturnsNull() {
        Attribute attribute = attributes.add("test", null);
        assertEquals(null, attribute.getValue());
    }

    @Test
    public void testGet_WithoutKeyReturnsEmptyString() {
        Attribute attribute = attributes.add(null, "value");
        assertEquals("", attribute.getValue());
    }

    @Test
    public void testGet_WithNullKeyReturnsNull() {
        Attribute attribute = attributes.add(null, null);
        assertEquals(null, attribute.getValue());
    }

    @Test
    public void testGet_WithoutKeywordReturnsEmptyString() {
        Attribute attribute = attributes.add("test", "value");
        assertEquals("", attribute.getValue());
    }

    @Test
    public void testGet_WithKeyContainsWhitespaceReturnsOriginalAttribute() {
        Attribute attribute = attributes.add("test \n value", "value");
        String originalValue = attribute.getValue();
        assertEquals(originalValue, new Object[]{attribute, "value"});
    }

    @Test
    public void testGet_WithoutKeywordContainsWhitespaceReturnsNull() {
        Attribute attribute = attributes.add("test\n value", null);
        assertEquals(null, attribute.getValue());
    }

    @Test
    public void testGet_WithKeyEqualsValueReturnsOriginalAttribute() {
        Attribute attribute = attributes.add("test", "value");
        String originalValue = attribute.getValue();
        assertEquals(originalValue, new Object[]{attribute, "value"});
    }

    @Test
    public void testGet_WithKeywordEqualsValueReturnsNull() {
        Attribute attribute = attributes.add("test:equivalent: value", null);
        assertEquals(null, attribute.getValue());
    }

    @Test
    public void testGet_WithKeyContainsPunctuationReturnsOriginalAttribute() {
        Attribute attribute = attributes.add("test .value", "value");
        String originalValue = attribute.getValue();
        assertEquals(originalValue, new Object[]{attribute, "value"});
    }

    @Test
    public void testGet_WithKeywordContainsPunctuationReturnsNull() {
        Attribute attribute = attributes.add("test:equivalent:.value", null);
        assertEquals(null, attribute.getValue());
    }

    @Test
    public void testGet_WithoutKeywordReturnsEmptyString() {
        Attribute attribute = attributes.add("test", "value");
        assertEquals("", attribute.getValue());
    }

    @Test
    public void testAdd_WithMultipleKeysAddsAllAttributes() {
        Attributes attributes2 = new Attributes(document);
        attributes.add("key1", "value1");
        attributes.add("key2", "value2");
        Attribute attribute = attributes2.get("key1");
        assertEquals(0, attribute.getValue().length());
    }

    @Test
    public void testAdd_WithMultipleValuesAddsAllAttributes() {
        Attributes attributes2 = new Attributes(document);
        attributes.add("key1", "value1");
        attributes.add("key1", "value11");
        Attribute attribute = attributes2.get("key1");
        assertEquals(0, attribute.getValue().length());
    }

    @Test
    public void testPut_WithMultipleKeysAddsAllAttributes() {
        Attributes attributes2 = new Attributes(document);
        attributes.put("key1", "value1");
        attributes2.put("key2", "value2");
        Attribute attribute = attributes.get("key1");
        assertEquals(0, attribute.getValue().length());
    }

    @Test
    public void testPut_WithMultipleValuesAddsAllAttributes() {
        Attributes attributes2 = new Attributes(document);
        attributes.put("key1", "value1");
        attributes.put("key1", "value11");
        Attribute attribute = attributes.get("key1");
        assertEquals(0, attribute.getValue().length());
    }

    @Test
    public void testPut_WithMultipleAttributesAddsAllAttributes() {
        Attributes attributes2 = new Attributes(document);
        attributes.put("key1", null);
        attributes2.put("key1", "value11");
        Attribute attribute = attributes.get("key1");
        assertEquals(0, attribute.getValue().length());
    }

    @Test
    public void testPut_WithoutKeywordReturnsEmptyString() {
        Document document = new Document();
        Attributes attributes = new Attributes(document);
        String value = "value";
        attributes.put(null, value);
        assertEquals(value, new Object[]{null, value});
    }

    @Test
    public void testPut_WithNullKeyReturnsNull() {
        Document document = new Document();
        Attributes attributes = new Attributes(document);
        String value = "value";
        attributes.put(null, value);
        assertEquals(value, new Object[]{null, value});
    }

    @Test
    public void testPut_WithKeywordEqualsValueReturnsNull() {
        Document document = new Document();
        Attributes attributes = new Attributes(document);
        String key = "key";
        String value = null;
        attributes.put(key, value);
        assertEquals(null, attributes.get(key));
    }

    @Test
    public void testRemove_WithMultipleKeysRemovesAllAttributes() {
        Attributes attributes = new Attributes(document);
        attributes.remove("key1");
        Attribute attribute = attributes.get("key1");
        assertEquals(0, attribute.getValue().length());
    }

    @Test
    public void testRemove_WithoutKeywordRemovesAttribute() {
        Document document = new Document();
        Attributes attributes = new Attributes(document);
        String value = "value";
        attributes.remove(null);
        Attribute attribute = attributes.get("key1");
        assertEquals(0, attribute.getValue().length());
    }

    @Test
    public void testRemove_WithNullKeyRemovesAttribute() {
        Document document = new Document();
        Attributes attributes = new Attributes(document);
        String value = "value";
        attributes.remove(null);
        Attribute attribute = attributes.get("key1");
        assertEquals(0, attribute.getValue().length());
    }

    @Test
    public void testRemove_WithKeywordRemovesAttribute() {
        Document document = new Document();
        Attributes attributes = new Attributes(document);
        String key = "key";
        String value = null;
        attributes.remove(key);
        Attribute attribute = attributes.get(key);
        assertEquals(0, attribute.getValue().length());
    }

    @Test
    public void testRemove_WithoutKeywordRemovesAttribute() {
        Document document = new Document();
        Attributes attributes = new Attributes(document);
        String key = "key";
        String value = null;
        attributes.remove(null);
        Attribute attribute = attributes.get(key);
        assertEquals(0, attribute.getValue().length());
    }

    @Test
    public void testRemove_WithMultipleAttributesRemovesAttribute() {
        Document document = new Document();
        Attributes attributes = new Attributes(document);
        attributes.remove("key1");
        Attribute attribute = attributes.get("key2");
        assertEquals(0, attribute.getValue().length());
    }

}