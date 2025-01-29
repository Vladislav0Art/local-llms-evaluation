package org.jsoup.nodes;

public class GeneratedTestHasDeclaredValueForKey {

    @Test
    public void testHasDeclaredValueForKey() {
        Attributes attributes = new Attributes();
        String key = "key";
        String value = "value";
        attributes.put(key, value);
        assertTrue(attributes.hasDeclaredValueForKey(key));
    }

}