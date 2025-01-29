package org.jsoup.nodes;

public class GeneratedTestGet {

    @Test
    public void testGet() {
        Attributes attributes = new Attributes();
        assertEquals("attribute1", attributes.get("attribute1"));
        assertEquals("", attributes.get("nonexistentkey"));
    }

}