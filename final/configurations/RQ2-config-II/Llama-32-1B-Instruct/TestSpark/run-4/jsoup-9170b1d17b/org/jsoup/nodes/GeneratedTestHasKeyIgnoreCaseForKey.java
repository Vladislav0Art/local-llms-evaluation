package org.jsoup.nodes;

public class GeneratedTestHasKeyIgnoreCaseForKey {

    @Test
    public void testHasKeyIgnoreCaseForKey() {
        Attributes attrs = new Attributes();
        String key = "key";
        Object value = null;
        attrs.putIgnoreCase(key, value);
        boolean expectedValue = true;
        assertTrue(attrs.containsKeyIgnoreCase(key));
    }

}