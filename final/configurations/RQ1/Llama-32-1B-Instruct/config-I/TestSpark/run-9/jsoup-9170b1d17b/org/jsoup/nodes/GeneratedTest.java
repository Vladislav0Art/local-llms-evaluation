package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testEquals() {
        // Test the equals method
        Attributes attributes1 = new Attributes();
        attributes1.set("value1", "value1");
        attributes1.normalize();

        Attributes attributes2 = new Attributes();
        attributes2.set("value2", "value2");
        attributes2.normalize();

        System.out.println(attributes1.equals(attributes2));
    }

    @Test
    public void testGetHashCode() {
        // Test the hashCode method
        Attributes attributes = new Attributes();
        attributes.set("value1", "value1");

        int hashcode1 = attributes.hashCode();
        int hashcode2 = attributes.hashCode();

        System.out.println(hashcode1 == hashcode2);
    }

    @Test
    public void testGetAttributes() {
        // Test the get method to retrieve Attributes object.
        Attributes attributes = new Attributes();

        attributes.set("value1", "value1");
        attributes.normalize();

        Object attr = attributes.get("value1");

        if (attr instanceof String) {
            System.out.println(((String) attr));
        } else {
            // Handle different types of values in Attrubutes object.
        }
    }

    @Test
    public void testGetDataPrefix() {
        // Test the get method to retrieve the data prefix.
        Attributes attributes = new Attributes();

        attributes.set("value1", "value1");
        attributes.normalize();

        String dataPrefix = attributes.getDataPrefix();

        if (dataPrefix != null) {
            System.out.println(dataPrefix);
        } else {
            System.out.println(null);
        }
    }

    @Test
    public void testGetInternalPrefix() {
        // Test the get method to retrieve the internal prefix.
        Attributes attributes1 = new Attributes();

        attributes1.set("value1", "value1");

        String internalPrefix = attributes1.getInternalPrefix();

        if (internalPrefix != null) {
            System.out.println(internalPrefix);
        } else {
            System.out.println(null);
        }
    }

    @Test
    public void testRemove() {
        // Test the remove method to remove a specific attribute.
        Attributes attributes = new Attributes();

        attributes.set("value1", "value1");
        attributes.normalize();

        int index = attributes.remove("value1");

        if (index == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    @Test
    public void testGetAllKeys() {
        // Test the get method to retrieve all keys.
        Attributes attributes = new Attributes();

        attributes.set("value1", "value1");
        attributes.normalize();

        for (String key : attributes.getAllKeys()) {
            System.out.println(key);
        }
    }

    @Test
    public void testGetAllValues() {
        // Test the get method to retrieve all values.
        Attributes attributes = new Attributes();

        attributes.set("value1", "value1");
        attributes.normalize();

        Object[] values = attributes.getAllValues();

        for (Object value : values) {
            System.out.println(value);
        }
    }

    @Test
    public void testRemoveAllKeys() {
        // Test the remove method to remove all keys.
        Attributes attributes = new Attributes();

        attributes.set("value1", "value1");
        attributes.normalize();

        int index = attributes.removeAllKeys();

        if (index == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    @Test
    public void testRemoveAllValues() {
        // Test the remove method to remove all values.
        Attributes attributes = new Attributes();

        attributes.set("value1", "value1");
        attributes.normalize();

        int index = attributes.removeAllValues();

        if (index == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    @Test
    public void testNormalize() {
        // Test the normalize method to normalize all keys and values.
        Attributes attributes = new Attributes();

        attributes.set("value1", "value1");
        attributes.normalize();

        String dataPrefix = attributes.getDataPrefix();

        if (dataPrefix != null) {
            System.out.println(dataPrefix);
        } else {
            System.out.println(null);
        }
    }

    @Test
    public void testDeduplicate() {
        // Test the deduplicate method to remove duplicate attribute.
        Attributes attributes1 = new Attributes();

        attributes1.set("value1", "value2");
        attributes1.normalize();

        int dupes = attributes1.deduplicate(ParseSettings.preserveAttributeCase()).size();

        System.out.println(dupes);
    }

}