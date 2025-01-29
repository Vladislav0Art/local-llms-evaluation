package org.jsoup.nodes;

public class GeneratedTestGetIgnoreCase {

    private Attributes attributes;

    @Test
    public void testGetIgnoreCase() {
        attributes = new Attributes();
        String key = "testKey";
        String value = "testValue";
        attributes.put(key, value);
        assertEquals(value, attributes.getIgnoreCase(key));
    }

}