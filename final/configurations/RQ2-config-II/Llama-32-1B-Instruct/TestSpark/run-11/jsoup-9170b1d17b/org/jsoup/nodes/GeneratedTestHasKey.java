package org.jsoup.nodes;

public class GeneratedTestHasKey {

    @Test
    public void testHasKey() {
        Attributes attributes = new Attributes();
        assertTrue(attributes.hasKey("key"));
        assertFalse(attributes.hasKey("keyElseValue"));
    }

}