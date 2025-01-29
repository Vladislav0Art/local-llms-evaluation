package org.jsoup.nodes;

public class GeneratedTestHtml_ReturnsString {

    private Attributes attributes;

    @Test
    public void testHtml_ReturnsString() {
        String key = "key1";
        Object value = null;
        attributes.put(key, value);
        String string = attributes.html(null);
        assertNotNull(string);
    }

}