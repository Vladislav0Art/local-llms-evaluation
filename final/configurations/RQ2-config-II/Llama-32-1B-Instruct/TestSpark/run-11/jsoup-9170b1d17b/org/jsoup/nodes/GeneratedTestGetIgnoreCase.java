package org.jsoup.nodes;

public class GeneratedTestGetIgnoreCase {

    @Test
    public void testGetIgnoreCase() {
        Attributes attributes = new Attributes();
        assertNotEquals("", attributes.getIgnoreCase("key"));
        assertEquals("value", attributes.getIgnoreCase("keyElseValue"));
    }

}