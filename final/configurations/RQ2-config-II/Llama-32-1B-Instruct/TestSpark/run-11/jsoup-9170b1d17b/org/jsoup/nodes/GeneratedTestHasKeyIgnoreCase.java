package org.jsoup.nodes;

public class GeneratedTestHasKeyIgnoreCase {

    @Test
    public void testHasKeyIgnoreCase() {
        Attributes attributes = new Attributes();
        assertTrue(attributes.hasKeyIgnoreCase("key"));
        assertFalse(attributes.hasKeyIgnoreCase("keyElseValue"));
    }

}