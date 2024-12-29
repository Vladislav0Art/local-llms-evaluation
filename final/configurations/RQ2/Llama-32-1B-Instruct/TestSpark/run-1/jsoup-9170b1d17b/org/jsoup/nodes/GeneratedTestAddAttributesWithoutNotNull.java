package org.jsoup.nodes;

public class GeneratedTestAddAttributesWithoutNotNull {

    @Test
    public void testAddAttributesWithoutNotNull() {
        Attributes attributes = new Attributes();
        attributes.add("key1", "value1");
        assertEquals("value1", attributes.get("key1"));
    }

}