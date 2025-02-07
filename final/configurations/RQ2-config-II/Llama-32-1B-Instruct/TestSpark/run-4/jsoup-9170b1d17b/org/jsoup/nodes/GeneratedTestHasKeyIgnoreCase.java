package org.jsoup.nodes;

public class GeneratedTestHasKeyIgnoreCase {

    @Test
    public void testHasKeyIgnoreCase() {
        Attributes attrs = new Attributes();
        String key = "key";
        Object value = null;
        attrs.putIgnoreCase(key, value);
        boolean expectedValue = true;
        assertTrue(attrs.containsKeyIgnoreCase(key));
    }

}