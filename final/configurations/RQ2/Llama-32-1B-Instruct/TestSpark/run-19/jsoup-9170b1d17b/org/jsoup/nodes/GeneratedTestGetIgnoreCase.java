package org.jsoup.nodes;

public class GeneratedTestGetIgnoreCase {

    private static final Document document = new Document();

    @Test
    public void testGetIgnoreCase() {
        String key = "test";
        String value = "Hello, World!";
        Attributes attributes = new Attributes(document);
        assertEquals(value, attributes.getIgnoreCase(key));
    }

}