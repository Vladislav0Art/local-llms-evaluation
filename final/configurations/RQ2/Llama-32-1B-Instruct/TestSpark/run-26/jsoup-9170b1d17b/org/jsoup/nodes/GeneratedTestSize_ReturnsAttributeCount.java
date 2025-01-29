package org.jsoup.nodes;

public class GeneratedTestSize_ReturnsAttributeCount {

    private Attributes attributes;

    @Test
    public void testSize_ReturnsAttributeCount() {
        String key = "key1";
        Object value = null;
        attributes.put(key, value);
        assertEquals(1, attributes.size());
    }

}