package org.jsoup.nodes;

public class GeneratedTestGetIgnoreCaseString {

    @Test
    public void testGetIgnoreCaseString() {
        Attributes attributes = new Attributes();
        assertEquals("", attributes.getIgnoreCase("key"));
        String value = "Value";
        attributes.put("key", value);
        assertEquals(value, attributes.getIgnoreCase("key"));
    }

}