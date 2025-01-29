package org.jsoup.nodes;

public class GeneratedTestGetString {

    @Test
    public void testGetString() {
        Attributes attributes = new Attributes();
        assertEquals("", attributes.get("key"));
        String value = "value";
        attributes.put("key", value);
        assertEquals(value, attributes.get("key"));
    }

}