package org.jsoup.nodes;

public class GeneratedTestGetIgnoreCase {

    @Test
    public void testGetIgnoreCase() {
        Attributes attributes = new Attributes();
        assertEquals("attribute1", attributes.getIgnoreCase("attribute1"));
        assertEquals("", attributes.getIgnoreCase("nonexistentkey"));
    }

}