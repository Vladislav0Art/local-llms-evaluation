package org.jsoup.nodes;

public class GeneratedTestSize {

    @Test
    public void testSize() {
        Attributes attributes = new Attributes();
        assertEquals(0, attributes.size());
        attributes.add("key", "value");
        assertEquals(1, attributes.size());
    }

}