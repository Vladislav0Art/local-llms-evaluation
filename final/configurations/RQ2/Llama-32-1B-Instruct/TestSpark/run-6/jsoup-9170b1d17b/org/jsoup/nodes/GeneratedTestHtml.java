package org.jsoup.nodes;

public class GeneratedTestHtml {

    @Test
    public void testHtml() {
        Attributes attributes = new Attributes();
        String value = "value";
        attributes.put("key", value);
        String html = attributes.html();
        assertEquals(value, html);
    }

}