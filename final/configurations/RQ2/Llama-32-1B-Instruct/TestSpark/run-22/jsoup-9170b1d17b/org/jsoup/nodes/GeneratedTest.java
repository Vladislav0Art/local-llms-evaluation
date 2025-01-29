package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTest {

    @Test
    public void testIndexOfKeyNotNull() {
        Attributes attrs = new Attributes();
        assertTrue(attrs.indexOfKey("test") != -1);
        assertEquals(0, attrs.indexOfKey("test"));
    }

    @Test
    public void testIndexOfKeyNull() {
        Attributes attrs = new Attributes();
        assertNotNull(attrs.indexOfKey(null));
        assertEquals(-1, attrs.indexOfKey(null));
    }

    @Test
    public void testCheckNotNullNullValues() {
        Attributes attrs = new Attributes();
        assertTrue(Attributes.checkNotNull("test"));
        assertFalse(Attributes.checkNotNull(null));
    }

    @Test
    public void testGetNullValue() {
        Attributes attrs = new Attributes();
        assertEquals("test", attrs.get("test").toString());
        assertNull(attrs.getUserData("test"));
    }

    @Test
    public void testGetNonExistingKeyReturnsDefault() {
        Attributes attrs = new Attributes();
        assertNotNull(attrs.get("non-existing-key"));
        assertNull(attrs.get("not-found-key"));
    }

    @Test
    public void testGetIgnoreCaseNullValues() {
        Attributes attrs = new Attributes();
        assertEquals("", attrs.getIgnoreCase("test").toString());
        assertNull(attrs.getUserData("test"));
    }

    @Test
    public void testGetIgnoreCaseNonExistingKeyReturnsDefault() {
        Attributes attrs = new Attributes();
        assertNotNull(attrs.getIgnoreCase("non-existing-key"));
        assertNull(attrs.getUserData("non-existing-key"));
    }

    @Test
    public void testRemoveNullValue() {
        Attributes attrs = new Attributes();
        assertFalse(attrs.remove(null));
        assertTrue(attrs.remove("test"));
    }

    @Test
    public void testRemoveNonExistingKeyReturnsFalse() {
        Attributes attrs = new Attributes();
        assertFalse(attrs.removeIgnoreCase("non-existing-key"));
        assertTrue(attrs.remove("non-existent-key"));
    }

    @Test
    public void testRemoveNullValueCaseInsensitive() {
        Attributes attrs = new Attributes();
        assertFalse(attrs.removeIgnoreCase(null));
        assertTrue(attrs.remove("non-existing-key"));
    }

    @Test
    public void testRemoveNonExistingKeyCaseInsensitiveReturnsFalse() {
        Attributes attrs = new Attributes();
        assertFalse(attrs.removeIgnoreCase("non-existing-key"));
        assertTrue(attrs.remove("non-existent-key"));
    }

    @Test
    public void testPutValue() {
        Attributes attrs = new Attributes();
        attrs.put("test", "value");
        assertEquals("value", attrs.get("test").toString());
        assertNull(attrs.getUserData("test"));
    }

    @Test
    public void testPutNullValue() {
        Attributes attrs = new Attributes();
        assertNotNull(attrs.put(null, "value"));
        assertFalse(attrs.hasKey(null));
        assertNull(attrs.getUserData(null));
    }

    @Test
    public void testPutNonExistingKeyReturnsFalse() {
        Attributes attrs = new Attributes();
        assertTrue(attrs.putIgnoreCase("non-existing-key", "value"));
        assertFalse(attrs.hasKey("non-existent-key"));
        assertNull(attrs.getUserData("non-existent-key"));
    }

    @Test
    public void testPutNullValueCaseInsensitive() {
        Attributes attrs = new Attributes();
        assertNotNull(attrs.putIgnoreCase(null, "value"));
        assertFalse(attrs.hasKeyIgnoreCase(null));
        assertNull(attrs.getUserData(null));
    }

    @Test
    public void testPutNonExistingKeyCaseInsensitiveReturnsFalse() {
        Attributes attrs = new Attributes();
        assertTrue(attrs.putIgnoreCase("non-existing-key", "value"));
        assertFalse(attrs.hasKeyIgnoreCase("non-existent-key"));
        assertNull(attrs.getUserData("non-existent-key"));
    }

    @Test
    public void testPutValueIgnoreCaseNullValues() {
        Attributes attrs = new Attributes();
        assertNotNull(attrs.putIgnoreCase(null, "value"));
        assertFalse(attrs.getUserData(null));
    }

    @Test
    public void testPutValueIgnoreCaseNonExistingKeyReturnsFalse() {
        Attributes attrs = new Attributes();
        assertTrue(attrs.putIgnoreCase("non-existing-key", "value"));
        assertFalse(attrs.getUserData("non-existent-key"));
    }

    @Test
    public void testPutValueIgnoreCaseNullValuesCaseInsensitive() {
        Attributes attrs = new Attributes();
        assertNotNull(attrs.putIgnoreCase(null, "value"));
        assertFalse(attrs.getUserData(null));
    }

    @Test
    public void testPutValueIgnoreCaseNonExistingKeyCaseInsensitiveReturnsFalse() {
        Attributes attrs = new Attributes();
        assertTrue(attrs.putIgnoreCase("non-existing-key", "value"));
        assertFalse(attrs.getUserData("non-existent-key"));
    }

    @Test
    public void testPutValueIgnoreCaseNullValuesDefault() {
        Attributes attrs = new Attributes();
        assertNull(attrs.putIgnoreCase(null, "value"));
        assertEquals("value", attrs.get("test").toString());
        assertNull(attrs.getUserData("test"));
    }

    @Test
    public void testPutUserData() {
        Attributes attrs = new Attributes();
        attrs.putUserData("test", "value");
        assertEquals("value", attrs.getUserData("test").toString());
        assertNull(attrs.getUserData("test"));
    }

    @Test
    public void testRemoveValue() {
        Attributes attrs = new Attributes();
        attrs.remove("test");
        assertTrue(attrs.isEmpty());
    }

    @Test
    public void testRemoveNonExistingKeyReturnsFalse() {
        Attributes attrs = new Attributes();
        assertFalse(attrs.removeIgnoreCase("non-existing-key"));
        assertTrue(attrs.remove("non-existent-key"));
    }

}