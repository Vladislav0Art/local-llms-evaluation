package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void testGetStringForKey() {
        Attributes attributes = new Attributes();
        when(attributes.get("key")).thenReturn("value");
        assertEquals("value", attributes.getString("key"));
    }

    @Test
    public void testGetStringIgnoreCaseForKey() {
        Attributes attributes = new Attributes();
        when(attributes.getIgnoreCase("key")).thenReturn("value");
        assertEquals("Value", attributes.getStringIgnoreCase("key"));
    }

    @Test
    public void testGetUserDataByKey() {
        Attributes attributes = new Attributes();
        Object userData = "user data";
        when(attributes.getUserData("key")).thenReturn(userData);
        assertEquals(userData, attributes.getUserData("key"));
    }

    @Test
    public void testAddStringKeyValue() {
        Attributes attributes = new Attributes();
        String key = "test_key";
        String value = "test_value";
        when(attributes.add(key, value)).thenReturn(true);
        assertTrue(attributes.addStringKeyValue(key, value));
    }

    @Test
    public void testAddStringKeyValueWithAttr() {
        Attributes attributes = new Attributes();
        String key = "test_key";
        String value = "test_value";
        when(attributes.put(key, value)).thenReturn(true);
        assertTrue(attributes.addStringKeyValueWithAttr(key, value));
    }

    @Test
    public void testRemoveStringKey() {
        Attributes attributes = new Attributes();
        when(attributes.remove("key")).thenReturn(true);
        assertTrue(attributes.remove("key"));
    }

    @Test
    public void testRemoveStringKeyIdIgnoreCase() {
        Attributes attributes = new Attributes();
        when(attributes.removeIgnoreCase("key")).thenReturn(true);
        assertTrue(attributes.remove("Key").isEmpty());
    }

    @Test
    public void testHasValueForKey() {
        Attributes attributes = new Attributes();
        when(attributes.hasValueForKey("key")).thenReturn(false);
        assertFalse(attributes.hasValueForKey("key"));
    }

    @Test
    public void testHasValueForKeyIgnoreCase() {
        Attributes attributes = new Attributes();
        when(attributes.hasValueForKeyIgnoreCase("key")).thenReturn(false);
        assertFalse(attributes.hasValueForKeyIgnoreCase("Key"));
    }

    @Test
    public void testHasKey() {
        Attributes attributes = new Attributes();
        when(attributes.hasKey("key")).thenReturn(true);
        assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void testHasKeyIgnoreCase() {
        Attributes attributes = new Attributes();
        when(attributes.hasKeyIgnoreCase("key")).thenReturn(true);
        assertTrue(attributes.hasKeyIgnoreCase("Key"));
    }

    @Test
    public void testHasDeclaredValueForKey() {
        Attributes attributes = new Attributes();
        when(attributes.hasDeclaredValueForKey("key")).thenReturn(false);
        assertFalse(attributes.hasDeclaredValueForKey("key"));
    }

    @Test
    public void testHasDeclaredValueForKeyIgnoreCase() {
        Attributes attributes = new Attributes();
        when(attributes.hasDeclaredValueForKeyIgnoreCase("key")).thenReturn(false);
        assertFalse(attributes.hasDeclaredValueForKeyIgnoreCase("Key"));
    }

    @Test
    public void testSize() {
        Attributes attributes = new Attributes();
        assertEquals(0, attributes.size());
        attributes.addStringKeyValue("test_key", "test_value");
        assertEquals(1, attributes.size());
    }

    @Test
    public void testIsEmpty() {
        Attributes attributes = new Attributes();
        when(attributes.isEmpty()).thenReturn(true);
        assertTrue(attributes.isEmpty());
        attributes.addStringKeyValue("key", "value");
        assertTrue(!attributes.isEmpty());
    }

    @Test
    public void testAddAllAttributes() {
        Attributes attributes1 = new Attributes();
        attributes1.addStringKeyValue("key1", "value1");
        when(attributes1.addAll(incoming)).thenReturn(true);
        assertTrue(attributes1.addAll(Attributes.empty()));
        attributes1.removeAllStringKeyValue("key1");
        assertEquals(0, attributes1.size());
    }

    @Test
    public void testRemoveAllStringKeyValue() {
        Attributes attributes = new Attributes();
        String key = "test_key";
        when(attributes.removeStringKey()).thenReturn(true);
        assertTrue(attributes.removeStringKey(key));
        assertFalse(attributes.hasDeclaredValueForKey(key));
        attributes.removeAllStringKeyValue("key");
        assertEquals(0, attributes.size());
    }

    @Test
    public void testAddAllStringKeyValueWithAttr() {
        Attributes attributes = new Attributes();
        String key = "test_key";
        String value = "test_value";
        when(attributes.addStringKeyValueWithAttr(key, value)).thenReturn(true);
        assertTrue(attributes.addStringKeyValueWithAttr("key", "value"));
        assertEquals(1, attributes.size());
    }

    @Test
    public void testAddAllAttributesWithAttr() {
        Attributes attributes = new Attributes();
        String key = "test_key";
        String value = "test_value";
        when(attributes.addStringKeyValueWithAttr(key, value)).thenReturn(true);
        assertTrue(attributes.addStringKeyValueWithAttr("key", "value"));
        assertEquals(1, attributes.size());
    }

    @Test
    public void testAddAllAttributesWithoutAttr() {
        Attributes attributes = new Attributes();
        String key = "test_key";
        when(attributes.addStringKeyValue(key, "value")).thenReturn(true);
        assertTrue(attributes.addStringKeyValue("key", "value"));
        assertEquals(1, attributes.size());
    }

    @Test
    public void testRemoveAllAttributes() {
        Attributes attributes = new Attributes();
        String key = "test_key";
        when(attributes.removeStringKeyValue(key)).thenReturn(true);
        assertTrue(attributes.removeStringKeyValue("key"));
        assertFalse(attributes.hasDeclaredValueForKey("key"));
        attributes.removeAllStringKeyValue("key");
        assertEquals(0, attributes.size());
    }

    @Test
    public void testRemoveAllAttributesWithAttr() {
        Attributes attributes = new Attributes();
        String key = "test_key";
        when(attributes.removeStringKeyValue(key)).thenReturn(true);
        assertTrue(attributes.removeStringKeyValue("key"));
        assertFalse(attributes.hasDeclaredValueForKey("key"));
        attributes.removeAllStringKeyValue("key");
        assertEquals(0, attributes.size());
    }

    @Test
    public void testHasAttributeWithAttr() {
        Attributes attributes = new Attributes();
        String key = "test_key";
        when(attributes.hasStringKeyValue(key)).thenReturn(true);
        assertTrue(attributes.hasStringKeyValue("key"));
        when(attributes.hasStringKeyValue(key)).thenReturn(false);
        assertFalse(attributes.hasStringKeyValue("Key"));
    }

    @Test
    public void testGetAllAttributes() {
        Attributes attributes = new Attributes();
        String key1 = "test_key1";
        when(attributes.getStringKeyValue(key1)).thenReturn("value1");
        assertEquals(1, attributes.size());
        String value = attributes.getStringValue(key1);
        assertEquals("value1", value);
    }

    @Test
    public void testGetAllAttributesWithAttr() {
        Attributes attributes = new Attributes();
        String key = "test_key";
        when(attributes.getStringKeyValues(key)).thenReturn(Attributes.empty());
        assertEquals(0, attributes.size());
    }

    @Test
    public void testToString() {
        Attributes attributes = new Attributes();
        when(attributes.toString()).thenReturn("some string");
        assertEquals("some string", attributes.toString());
    }

}