package org.jsoup.nodes;

public class GeneratedTestGetIgnoreCase {

    @Test
    public void testGetIgnoreCase() {
        Attributes attributes = new Attributes();
        String key = "Key";
        String value = "Value";
        attributes.put(key, value);
        assertEquals(value, attributes.getIgnoreCase(key));
    }

}