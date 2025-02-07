package org.jsoup.nodes;

public class GeneratedTestHasDeclaredValueForKeyIgnoreCase {

    @Test
    public void testHasDeclaredValueForKeyIgnoreCase() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertTrue(attributes.hasDeclaredValueForKeyIgnoreCase("key"));
        assertFalse(attributes.hasDeclaredValueForKeyIgnoreCase("keyElseValue"));
    }

}