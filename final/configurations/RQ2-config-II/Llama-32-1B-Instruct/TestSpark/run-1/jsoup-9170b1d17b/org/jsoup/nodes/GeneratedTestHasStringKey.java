package org.jsoup.nodes;

public class GeneratedTestHasStringKey {

    @Test
    public void testHasStringKey() {
        String key = "test";
        Object value = null;
        Attributes attributes = new Attributes();
        attributes.add(key, value);
        assertTrue(attributes.hasDeclaredValueForKey(key));
        assertTrue(attributes.hasDeclaredValueForKeyIgnoreCase(key));
    }

}