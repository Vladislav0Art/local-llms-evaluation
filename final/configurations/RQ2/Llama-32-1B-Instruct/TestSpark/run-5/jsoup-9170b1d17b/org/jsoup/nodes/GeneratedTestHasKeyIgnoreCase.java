package org.jsoup.nodes;

public class GeneratedTestHasKeyIgnoreCase {

    @Test
    public void testHasKeyIgnoreCase() {
        Attributes attributes = new Attributes();
        String key = "key";
        String value = "value";
        attributes.putIgnoreCase(key, value);
        assertTrue(attributes.hasDeclaredValueForKeyIgnoreCase(key));
    }

}