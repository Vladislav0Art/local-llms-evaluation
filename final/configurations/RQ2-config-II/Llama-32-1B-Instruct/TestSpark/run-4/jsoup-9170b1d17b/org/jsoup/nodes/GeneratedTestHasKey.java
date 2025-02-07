package org.jsoup.nodes;

public class GeneratedTestHasKey {

    @Test
    public void testHasKey() {
        Attributes attrs = new Attributes();
        String key = "key";
        Object value = null;
        attrs.put(key, value);
        boolean expectedValue = true;
        assertTrue(attrs.hasKey(key));
    }

}