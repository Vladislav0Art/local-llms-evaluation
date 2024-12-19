package org.jsoup.nodes;

public class GeneratedTestGetString {

    @Test
    public void testGetString() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals("value", attributes.get("key"));
        assertNull(attributes.get(""));
    }

}