package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testIndexOfKeyString() {
        Attributes attributes = new Attributes();
        assertEquals(-1, attributes.indexOfKey("test"));
        assertEquals(0, attributes.indexOfKey("test"));
        assertEquals(-1, attributes.indexOfKey("non-existent"));
    }

    @Test
    public void testIndexOfKeyBoolean() {
        Attributes attributes = new Attributes(true);
        assertEquals(0, attributes.indexOfKey(true));
        assertEquals(1, attributes.indexOfKey(false));
    }

    @Test
    public void testIndexOfKeyNullString() {
        Attributes attributes = new Attributes();
        assertEquals(-1, attributes.indexOfKey(null));
        assertEquals(0, attributes.indexOfKey(""));
    }

    @Test
    public void testIndexOfKeyNullBoolean() {
        Attributes attributes = new Attributes();
        assertEquals(-1, attributes.indexOfKey(null));
        assertEquals(0, attributes.indexOfKey(false));
    }

    @Test
    public void testGetString() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals("value", attributes.get("key"));
        assertNull(attributes.get(""));
    }

    @Test
    public void testGetIgnoreCaseString() {
        Attributes attributes = new Attributes();
        attributes.put("Key", "Value");
        assertEquals("value", attributes.getIgnoreCase("Key"));
        assertNull(attributes.getIgnoreCase(""));
    }

    @Test
    public void testGetNullString() {
        Attributes attributes = new Attributes();
        assertNull(attributes.get(null));
        assertNull(attributes.get(""));
    }

    @Test
    public void testGetNullBoolean() {
        Attributes attributes = new Attributes();
        assertNull(attributes.get(null));
        assertNull(attributes.get(false));
    }

    @Test
    public void testGetStringIgnoreCase() {
        Attributes attributes = new Attributes();
        attributes.put("key", "Value");
        assertEquals("value", attributes.getIgnoreCase("Key"));
        assertNull(attributes.getIgnoreCase(""));
    }

    @Test
    public void testPutString() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        assertEquals("value1", attributes.getUserData("key1"));
        assertNull(attributes.getUserData(""));
    }

    @Test
    public void testPutIgnoreCaseString() {
        Attributes attributes = new Attributes();
        attributes.put("Key1", "Value1");
        assertEquals("value1", attributes.getUserData("Key1"));
        assertNull(attributes.getUserData(""));
    }

    @Test
    public void testPutNullString() {
        Attributes attributes = new Attributes();
        assertNotNull(attributes.put(null, "Value"));
        assertNotNull(attributes.put("", "Value"));
        assertNotNull(attributes.put(false, "Value"));
    }

    @Test
    public void testPutNullBoolean() {
        Attributes attributes = new Attributes();
        assertNull(attributes.put(null, false));
        assertNull(attributes.put("", false));
        assertNull(attributes.put(false, null));
    }

    @Test
    public void testPutStringAttribute() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        assertEquals("value1", attributes.get("key1"));
        assertNull(attributes.getUserData(""));
    }

    @Test
    public void testAddString() {
        Attributes attributes = new Attributes();
        attributes.add("key2", "value2");
        assertEquals("value2", attributes.getUserData("key2"));
        assertNotNull(attributes);
    }

    @Test
    public void testAddIgnoreCaseString() {
        Attributes attributes = new Attributes();
        attributes.add("Key2", "Value2");
        assertEquals("Value2", attributes.getUserData("Key2"));
        assertNotNull(attributes);
    }

    @Test
    public void testAddNullString() {
        Attributes attributes = new Attributes();
        attributes.add(null, "Value");
        assertNotNull(attributes);
    }

    @Test
    public void testAddNullBoolean() {
        Attributes attributes = new Attributes();
        attributes.add("", false);
        assertNotNull(attributes);
    }

    @Test
    public void testPutUserData() {
        Attributes attributes = new Attributes();
        attributes.putUserData("key3", "value3");
        assertEquals("value3", attributes.getUserData("key3"));
        assertNull(attributes.getUserData(""));
    }

    @Test
    public void testRemoveString() {
        Attributes attributes = new Attributes();
        attributes.remove("key1");
        assertNull(attributes.get("key1"));
        assertNotNull(attributes);
    }

    @Test
    public void testRemoveIgnoreCaseString() {
        Attributes attributes = new Attributes();
        attributes.removeIgnoreCase("Key1");
        assertNull(attributes.getUserData("Key1"));
        assertNotNull(attributes);
    }

    @Test
    public void testRemoveNullString() {
        Attributes attributes = new Attributes();
        attributes.remove(null);
        assertNotNull(attributes);
    }

    @Test
    public void testRemoveNullBoolean() {
        Attributes attributes = new Attributes();
        attributes.remove("", false);
        assertNotNull(attributes);
    }

}