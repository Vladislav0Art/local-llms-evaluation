package org.jsoup.nodes;

public class GeneratedTestHasKey {

    @Test
    public void testHasKey() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals(true, attributes.containsKey("key"));
    }

}