package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void testEquals() {
        Attributes attributes1 = new Attributes();
        Attributes attributes2 = new Attributes();

        attributes1.normalize();
        attributes2.normalize();

        System.out.println(attributes1.equals(attributes2)); // Expected: true

        attributes1.normalize();
        attributes2 = new Attributes();  // Reset attributes
        System.out.println(attributes1.equals(attributes2)); // Expected: false
    }

    @Test
    public void testGetKey() {
        Attributes attributes = new Attributes();

        String key = "test";
        attributes.addInternalPrefix(key);

        assertEquals(InternalPrefix + key, attributes.getKey(key));
        assertEquals("test", attributes.getValue(key));

        key = "test";
        attributes.removeInternalPrefix(key);
        System.out.println(attributes.getKey(key)); // Expected: test
    }

    @Test
    public void testGetValues() {
        Attributes attributes = new Attributes();

        String value1 = "value1";
        attributes.add(value1);

        String value2 = "value2";
        attributes.add(value2);

        assertEquals("value1", attributes.getValue(0));
        assertEquals("value2", attributes.getValue(1));

        // Test removing values
        attributes.removeInternalPrefix("test");
        System.out.println(attributes.getValue(0)); // Expected: null

        // Test updating existing value
        value1 = "newValue";
        attributes.update(0, value1);
        System.out.println(attributes.getValue(0)); // Expected: newValue
    }

    @Test
    public void testAddInternalPrefix() {
        Attributes attributes = new Attributes();

        String key = "test";
        attributes.addInternalPrefix(key);

        assertEquals("test", attributes.getKey(key));
        assertEquals("value1", attributes.getValue(key));

        // Test removing internal prefix and adding new value
        attributes.removeInternalPrefix("test");
        System.out.println(attributes.getValue("test")); // Expected: null

        // Test updating existing value with different prefix
        key = "prefixValue";
        attributes.update(0, "newValue");

        assertEquals("prefixValue", attributes.getKey(key));
        assertEquals("newValue", attributes.getValue(key));

        // Test removing internal prefix from key
        key = "prefixValue";
        System.out.println(attributes.getKey(key)); // Expected: value1

        // Test updating existing value with different prefix
        key = "value2";
        attributes.update(0, "newValue");

        assertEquals("value2", attributes.getValue(key));
    }

    @Test
    public void testRemoveInternalPrefix() {
        Attributes attributes = new Attributes();

        String key = "test";
        attributes.addInternalPrefix(key);

        System.out.println(attributes.getKey(key)); // Expected: test

        attributes.removeInternalPrefix(key);
        System.out.println(attributes.getKey(key)); // Expected: null
    }

    @Test
    public void testUpdate() {
        Attributes attributes = new Attributes();

        String key1 = "test";
        String value1 = "value1";

        attributes.addInternalPrefix(key1);

        assertEquals("value1", attributes.getValue(0));
        System.out.println(attributes.update(0, value1)); // Expected: null

        String key2 = "prefixValue";
        attributes.removeInternalPrefix(key2);
        System.out.println(attributes.update(0, "newValue")); // Expected: new-value
    }

    @Test
    public void testUpdateValues() {
        Attributes attributes = new Attributes();

        String value1 = "value1";

        attributes.addInternalPrefix("test");
        assertEquals("test", attributes.getValue("test"));
        System.out.println(attributes.update(0, value1)); // Expected: null

        String key2 = "prefixValue";
        attributes.removeInternalPrefix(key2);
        System.out.println(attributes.update(0, "newValue")); // Expected: new-value
    }

}