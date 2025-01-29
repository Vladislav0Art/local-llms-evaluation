package org.jsoup.nodes;

public class GeneratedTestIsEmpty {

    @Test
    public void testIsEmpty() {
        Attributes attributes = new Attributes();
        String key = "key";

        assertEquals(true, attributes.isEmpty());

        // Clear the internal map
        attributes.clear();

        assertEquals(false, attributes.isEmpty());
    }

}