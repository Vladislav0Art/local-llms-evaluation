package org.jsoup.nodes;

public class GeneratedTestGetIgnoreCase {

    @Test
    public void testGetIgnoreCase() {
        Attributes attributes = new Attributes();
        assertEquals("", attributes.getIgnoreCase("key"));
        assertEquals("Key", attributes.getUserData("key"));
    }

}