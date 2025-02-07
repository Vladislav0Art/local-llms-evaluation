package org.jsoup.nodes;

public class GeneratedTestHasDeclaredValueForKeyIgnoreCase {

    @Test
    public void testHasDeclaredValueForKeyIgnoreCase() {
        Attributes attrs = new Attributes();
        String key = "key";
        Object value = null;
        attrs.putIgnoreCase(key, value);
        boolean expectedValue = false;
        assertFalse(attrs.hasDeclaredValueForKeyIgnoreCase(key));
    }

}