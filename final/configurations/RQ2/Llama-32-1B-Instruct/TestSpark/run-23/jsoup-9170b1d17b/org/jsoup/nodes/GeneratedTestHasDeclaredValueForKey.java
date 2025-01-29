package org.jsoup.nodes;

public class GeneratedTestHasDeclaredValueForKey {

    @Test
    public void testHasDeclaredValueForKey() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertTrue(attributes.hasDeclaredValueForKey("key"));
    }

}