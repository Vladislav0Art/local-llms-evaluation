package org.jsoup.nodes;

public class GeneratedTestAddString {

    @Test
    public void testAddString() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals("value", attributes.get("key"));
    }

}