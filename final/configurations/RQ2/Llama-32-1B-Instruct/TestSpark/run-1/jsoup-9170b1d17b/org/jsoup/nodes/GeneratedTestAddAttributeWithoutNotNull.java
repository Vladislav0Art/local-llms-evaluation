package org.jsoup.nodes;

public class GeneratedTestAddAttributeWithoutNotNull {

    @Test
    public void testAddAttributeWithoutNotNull() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals("value", attributes.get("key"));
    }

}