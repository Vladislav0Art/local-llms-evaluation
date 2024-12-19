package org.jsoup.nodes;

public class GeneratedTestGetIgnoreCaseString {

    @Test
    public void testGetIgnoreCaseString() {
        Attributes attributes = new Attributes();
        attributes.put("Key", "Value");
        assertEquals("value", attributes.getIgnoreCase("Key"));
        assertNull(attributes.getIgnoreCase(""));
    }

}