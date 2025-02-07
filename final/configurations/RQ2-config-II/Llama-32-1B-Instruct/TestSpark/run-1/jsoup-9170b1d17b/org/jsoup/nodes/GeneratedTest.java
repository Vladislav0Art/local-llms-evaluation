package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testCheckNotNull() {
        Attributes attributes = new Attributes();
        assertEquals("", org.jsoup.nodes.Attributes.checkNotNull(attributes.getUserData("key")));
        assertEquals(null, org.jsoup.nodes.Attributes.checkNotNull(null));
    }

    @Test
    public void testAddStringKey() {
        String key = "test";
        String value = "value";
        Attributes attributes = new Attributes();
        attributes.add(key, value);
        assertEquals(value, attributes.getUserData(key));
        assertEquals(value, org.jsoup.nodes.Attributes.getUserValue(key));
    }

    @Test
    public void testGetStringKey() {
        String key = "test";
        String value = "value";
        Attributes attributes = new Attributes();
        attributes.add(key, value);
        assertEquals(value, attributes.get(key));
        assertEquals(value, org.jsoup.nodes.Attributes.get(key));
    }

    @Test
    public void testGetIgnoreCaseStringKey() {
        String key = "TEST";
        String value = "value";
        Attributes attributes = new Attributes();
        attributes.add(key, value);
        assertEquals(value, attributes.getIgnoreCase(key));
        assertEquals(value, org.jsoup.nodes.Attributes.getIgnoreCase(key));
    }

    @Test
    public void testPutStringKey() {
        String key = "test";
        Object value = "value";
        Attributes attributes = new Attributes();
        attributes.put(key, value);
        assertEquals(value, attributes.getUserData(key));
        assertEquals(value, org.jsoup.nodes.Attributes.getValue(key));
    }

    @Test
    public void testAddAttributes() {
        Attributes attributes1 = new Attributes();
        attributes1.add("test", "value");
        String key = "test";
        Object value = null;
        attributes1.put(String.valueOf(key), value);
        assertEquals(value, attributes1.getUserData(key));
    }

    @Test
    public void testAddStringKey() {
        String key = "test";
        String value = "value";
        Attributes attributes = new Attributes();
        attributes.addStringKey(key, value);
        assertEquals(value, attributes.getUserData(key));
        assertEquals(value, org.jsoup.nodes.Attributes.getValue(key));
    }

    @Test
    public void testGetAttributes() {
        String key = "test";
        String value = "value";
        Attributes attributes = new Attributes();
        attributes.add(key, value);
        assertEquals(value, attributes.getUserData(key));
    }

    @Test
    public void testRemoveStringKey() {
        String key = "test";
        Object value = null;
        Attributes attributes = new Attributes();
        attributes.remove(key);
        assertNull(attributes.getUserData(key));
    }

    @Test
    public void testRemoveAttributeKey() {
        String key = "test";
        Attributes attributes = new Attributes();
        attributes.put(String.valueOf(key), null);
        assertNull(attributes.getUserData(key));
    }

    @Test
    public void testHasStringKey() {
        String key = "test";
        Object value = null;
        Attributes attributes = new Attributes();
        attributes.add(key, value);
        assertTrue(attributes.hasDeclaredValueForKey(key));
        assertTrue(attributes.hasDeclaredValueForKeyIgnoreCase(key));
    }

}