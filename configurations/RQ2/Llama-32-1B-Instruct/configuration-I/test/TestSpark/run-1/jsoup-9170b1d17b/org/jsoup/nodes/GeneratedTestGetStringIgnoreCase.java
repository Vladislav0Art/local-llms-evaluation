package org.jsoup.nodes;

public class GeneratedTestGetStringIgnoreCase {

    @Test
    public void testGetStringIgnoreCase() {
        Attributes attributes = new Attributes();
        attributes.put("key", "Value");
        assertEquals("value", attributes.getIgnoreCase("Key"));
        assertNull(attributes.getIgnoreCase(""));
    }

}