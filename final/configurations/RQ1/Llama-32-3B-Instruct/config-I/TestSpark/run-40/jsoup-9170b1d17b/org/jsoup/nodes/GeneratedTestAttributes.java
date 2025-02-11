package org.jsoup.nodes;

public class GeneratedTestAttributes {

    @Test
    public void testAttributes() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals(1, attributes.size());
        assertTrue(attributes.containsKey("key"));
        assertEquals("value", attributes.get("key"));
    }

}