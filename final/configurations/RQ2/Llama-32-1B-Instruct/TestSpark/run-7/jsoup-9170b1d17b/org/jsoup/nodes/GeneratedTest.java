package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTest {

    @Test
    public void testRemove() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        attributes.remove("key2");
        assertTrue(attributes.isEmpty());
    }

    @Test
    public void testRemoveIgnoreCase() {
        Attributes attributes = new Attributes();
        attributes.putIgnoreCase("KEY1", "Value 1");
        attributes.removeIgnoreCase("nonExistentKey");
        assertFalse(attributes.hasDeclaredValueForKey("KEY1"));
    }

    @Test
    public void testHasDeclaredValueForKey() {
        Attributes attributes = new Attributes();
        attributes.putUserData("userKey", "userDataValue");
        assertTrue(attributes.hasDeclaredValueForKey("KEY1"));
        assertFalse(attributes.hasDeclaredValueForKey("nonExistentKey"));
    }

    @Test
    public void testHasDeclaredValueForKeyIgnoreCase() {
        Attributes attributes = new Attributes();
        attributes.putUserData("key2", "userDataValue");
        assertTrue(attributes.hasDeclaredValueForKeyIgnoreCase("KEY1"));
        assertFalse(attributes.hasDeclaredValueForKeyIgnoreCase("nonExistentKey"));
    }

    @Test
    public void testIsEmpty() {
        Attributes attributes = new Attributes();
        assertFalse(attributes.isEmpty());
        attributes.remove("key1");
        assertFalse(attributes.isEmpty());
    }

}