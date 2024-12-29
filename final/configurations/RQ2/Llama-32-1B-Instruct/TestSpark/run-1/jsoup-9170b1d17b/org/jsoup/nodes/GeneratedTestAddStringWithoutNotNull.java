package org.jsoup.nodes;

public class GeneratedTestAddStringWithoutNotNull {

    @Test
    public void testAddStringWithoutNotNull() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        assertEquals("value", attributes.get("key"));
    }

}