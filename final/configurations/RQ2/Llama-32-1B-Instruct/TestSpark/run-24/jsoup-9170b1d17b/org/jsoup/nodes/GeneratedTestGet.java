package org.jsoup.nodes;

public class GeneratedTestGet {

    @Test
    public void testGet() {
        Attributes attributes = new Attributes();
        assertEquals("", attributes.get("key"));
        assertEquals("key", attributes.getIgnoreCase("KEY"));
        assertNotEquals("", attributes.getUserData("key"));
    }

}