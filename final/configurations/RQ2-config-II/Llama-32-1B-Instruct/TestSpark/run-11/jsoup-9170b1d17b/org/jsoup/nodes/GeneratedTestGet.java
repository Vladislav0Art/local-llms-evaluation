package org.jsoup.nodes;

public class GeneratedTestGet {

    @Test
    public void testGet() {
        Attributes attributes = new Attributes();
        assertNotEquals("", attributes.get("key"));
        assertEquals("value", attributes.get("keyElseValue"));
    }

}