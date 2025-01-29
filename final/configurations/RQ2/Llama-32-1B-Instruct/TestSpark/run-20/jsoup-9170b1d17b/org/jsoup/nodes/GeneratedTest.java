package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testIndexOfKeyNotNull() {
        Attributes attributes = new Attributes();
        assertEquals(0, attributes.indexOfKey("key"));
        assertEquals(-1, attributes.indexOfKey(null));
    }

    @Test
    public void testIndexOfKeyStringNotNull() {
        Attributes attributes = new Attributes();
        assertEquals(0, attributes.indexOfKey("key"));
        assertEquals(0, attributes.indexOfKey("KEY"));
    }

    @Test
    public void testIndexOfKeyStringEquals() {
        Attributes attributes = new Attributes();
        assertEquals(-1, attributes.indexOfKey("key"));
        assertEquals(-1, attributes.indexOfKey("KEY"));
    }

    @Test
    public void testGetStringNotNull() {
        Attributes attributes = new Attributes();
        String key = "key";
        assertEquals(null, attributes.get(key));
        assertEquals("value", attributes.get(String.valueOf(key)));
    }

    @Test
    public void testGetStringEquals() {
        Attributes attributes = new Attributes();
        String key = "key";
        assertEquals("value", attributes.getIgnoreCase(key));
    }

    @Test
    public void testGetUserDataNotNull() {
        Attributes attributes = new Attributes();
        Object value = "value";
        assertEquals(value, attributes.getUserData(String.valueOf(key)));
    }

    @Test
    public void testPutStringNotNull() {
        Attributes attributes = new Attributes();
        String key = "key";
        Object value = "value";
        assertEquals(null, attributes.put(key, null));
        assertEquals("value", attributes.put(key, value));
    }

    @Test
    public void testPutStringEquals() {
        Attributes attributes = new Attributes();
        String key = "key";
        assertEquals("value", attributes.put(String.valueOf(key), "value"));
    }

    @Test
    public void testAddStringNotNull() {
        Attributes attributes = new Attributes();
        String key = "key";
        Object value = "value";
        attributes.add(key, value);
        assertEquals(value, attributes.getUserData(key));
    }

    @Test
    public void testPutAttributeNotNull() {
        Attributes attributes = new Attributes();
        String key = "key";
        Object value = "value";

        attributes.put(attributes.deduplicate(ParseSettings.of()), key, value);

        assertEquals(value, attributes.getUserData(key));
    }

    @Test
    public void testRemoveStringNotNull() {
        Attributes attributes = new Attributes();
        String key = "key";
        Object value = "value";

        attributes.remove(key);
        assertEquals(value, attributes.getUserData(key));

        attributes.removeIgnoreCase(key);
        assertEquals(0, attributes.getUserData(key));
    }

    @Test
    public void testRemoveStringEquals() {
        Attributes attributes = new Attributes();
        String key = "key";
        Object value = "value";

        attributes.remove(String.valueOf(key));
        assertEquals(null, attributes.getUserData(key));

        attributes.remove(String.valueOf(key).equalsIgnoreCase("KEY"));
        assertEquals(0, attributes.getUserData(key));
    }

    @Test
    public void testHasKeyNotNull() {
        Attributes attributes = new Attributes();
        String key = "key";
        boolean value = true;
        assertEquals(true, attributes.hasKey(key));

        String key2 = "key2";
        boolean value2 = false;
        assertEquals(false, attributes.hasKey(key2));
    }

    @Test
    public void testHasKeyStringNotEquals() {
        Attributes attributes = new Attributes();
        String key = "key";
        Object value = true;
        assertEquals(true, attributes.hasKey(String.valueOf(key)));

        String key2 = "key2";
        Object value2 = false;
        assertEquals(false, attributes.hasKey(String.valueOf(key2)));
    }

    @Test
    public void testHasKeyStringEquals() {
        Attributes attributes = new Attributes();
        String key = "key";
        Object value = true;

        assertEquals(true, attributes.hasKeyIgnoreCase(String.valueOf(key)));

        String key2 = "key2";
        Object value2 = false;
        assertEquals(false, attributes.hasKeyIgnoreCase(String.valueOf(key2)));
    }

    @Test
    public void testHasDeclaredValueForKeyNotNull() {
        Attributes attributes = new Attributes();
        String key = "key";

        // Note: internal set does not support null values.
        //      It will throw a NullPointerException when trying to put null value into it.

        Object value = 123;
        assertEquals(0, attributes.hasDeclaredValueForKey(key));

        // Internal set does not support checking declared value using equals() method
        //       for keys that do not have a corresponding internal attribute (e.g., "key" vs. "KEY")
    }

    @Test
    public void testHasDeclaredValueForKeyIgnoreCaseNotEquals() {
        Attributes attributes = new Attributes();
        String key = "key";

        Object value = 123;

        assertEquals(0, attributes.hasDeclaredValueForKey(String.valueOf(key)));

        // Internal set does not support checking declared value using equals() method
        //       for keys that do not have a corresponding internal attribute (e.g., "key" vs. "KEY")
    }

    @Test
    public void testHasDeclaredValueForKeyIgnoreCaseEquals() {
        Attributes attributes = new Attributes();
        String key = "key";
        Object value = 123;

        assertEquals(0, attributes.hasDeclaredValueForKey(String.valueOf(key).equalsIgnoreCase("key")));

        // Internal set does not support checking declared value using equals() method
        //       for keys that do not have a corresponding internal attribute (e.g., "key" vs. "KEY")
    }

    @Test
    public void testSize() {
        Attributes attributes = new Attributes();
        String key1 = "key";
        Object value1 = 123;
        String key2 = "key2";

        attributes.put(key1, value1);
        attributes.put(key2, value2);

        assertEquals(0, attributes.size());

        // Add elements
        attributes.add(key1, value1);
        attributes.add(key2, value2);

        assertEquals(1, attributes.size());
    }

    @Test
    public void testIsEmpty() {
        Attributes attributes = new Attributes();
        String key = "key";

        assertEquals(true, attributes.isEmpty());

        // Clear the internal map
        attributes.clear();

        assertEquals(false, attributes.isEmpty());
    }

    @Test
    public void testAddAll() {
        Attributes attributes1 = new Attributes();
        String key1 = "key";
        Object value1 = 123;
        String key2 = "key2";

        attributes1.put(key1, value1);
        attributes1.put(key2, value2);

        // Add elements from the second attribute
        attributes.addAll(attributes1);

        assertEquals(0, attributes.size());

        // Clear the internal map
        attributes.clear();

        assertEquals(true, attributes.isEmpty());
    }

    @Test
    public void testAddAllWithNullValues() {
        Attributes attributes = new Attributes();
        String key = "key";
        Object value = 123;
        String key2 = "key2";

        attributes.put(key, value);
        attributes.put(key2, value2);

        // Add elements from the second attribute
        attributes.addAll(attributes);

        assertEquals(1, attributes.size());

        // Clear the internal map
        attributes.clear();

        assertEquals(true, attributes.isEmpty());
    }

    @Test
    public void testAddStringNotEquals() {
        Attributes attributes = new Attributes();
        String key = "key";
        Object value = 123;

        attributes.put(key, value);
        attributes.add(String.valueOf(key), value2);

        assertEquals(0, attributes.size());

        // Clear the internal map
        attributes.clear();

        assertEquals(false, attributes.isEmpty());
    }

    @Test
    public void testAddStringEquals() {
        Attributes attributes = new Attributes();
        String key = "key";
        Object value = 123;
        Object value2 = 456;

        attributes.put(key, value);
        attributes.put(String.valueOf(key).equalsIgnoreCase("key"), value2);

        assertEquals(1, attributes.size());

        // Clear the internal map
        attributes.clear();

        assertEquals(true, attributes.isEmpty());
    }

    @Test
    public void testRemoveStringNotEquals() {
        Attributes attributes = new Attributes();
        String key = "key";
        Object value = 123;
        String key2 = "key2";

        attributes.remove(key);
        attributes.remove(String.valueOf(key));

        assertEquals(0, attributes.size());

        // Clear the internal map
        attributes.clear();

        assertEquals(false, attributes.isEmpty());
    }

    @Test
    public void testRemoveStringEquals() {
        Attributes attributes = new Attributes();
        String key = "key";
        Object value = 123;
        Object value2 = 456;

        attributes.remove(key);
        attributes.remove(String.valueOf(key).equalsIgnoreCase("key"));

        assertEquals(0, attributes.size());

        // Clear the internal map
        attributes.clear();

        assertEquals(false, attributes.isEmpty());
    }

    @Test
    public void testDeduplicate() {
        Attributes attributes1 = new Attributes();
        String key1 = "key";
        Object value1 = 123;
        String key2 = "key";

        attributes1.put(key1, value1);
        attributes1.put(key2, value2);

        Object value3 = 456;

        assertEquals(0, attributes.deduplicate(ParseSettings.of()).size());

        // Add an element to the map
        attributes.add(key1, value1);
        attributes.add(key2, value2);

        assertEquals(0, attributes.deduplicate(ParseSettings.of()).size());
    }

    @Test
    public void testDeduplicateWithNullValues() {
        Attributes attributes = new Attributes();
        String key1 = "key";
        Object value1 = 123;
        String key2 = "key";

        attributes.put(key1, value1);
        attributes.put(key2, value2);

        Object value3 = null;

        assertEquals(0, attributes.deduplicate(ParseSettings.of()).size());

        // Add an element to the map
        attributes.add(key1, value1);
        attributes.add(key2, value2);

        assertEquals(0, attributes.deduplicate(ParseSettings.of()).size());
    }

    @Test
    public void testDeduplicateWithNullValuesAndKeyEquals() {
        Attributes attributes = new Attributes();
        String key = "key";
        Object value = 123;
        Object value2 = 456;

        attributes.put(key, value);
        attributes.add(String.valueOf(key), value2);

        assertEquals(0, attributes.deduplicate(ParseSettings.of()).size());

        // Add an element to the map
        attributes.add(String.valueOf(key).equalsIgnoreCase("key"), value2);

        assertEquals(1, attributes.deduplicate(ParseSettings.of()).size());
    }

    @Test
    public void testDeduplicateWithNullValuesAndKeyEquals() {
        Attributes attributes = new Attributes();
        String key = "key";
        Object value = 123;
        Object value2 = null;

        attributes.put(key, value);
        attributes.add(String.valueOf(key).equalsIgnoreCase("key"), value2);

        assertEquals(1, attributes.deduplicate(ParseSettings.of()).size());
    }

}