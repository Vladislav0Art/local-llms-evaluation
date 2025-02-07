package org.jsoup.nodes;

public class GeneratedTestHasDeclaredValueForKey {

    @Test
    public void testHasDeclaredValueForKey() {
        Attributes attrs = new Attributes();
        String key = "key";
        Object value = null;
        attrs.put(key, value);
        boolean expectedValue = false;
        assertFalse(attrs.hasDeclaredValueForKey(key));
    }

}