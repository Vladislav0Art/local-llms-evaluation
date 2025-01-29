package org.jsoup.nodes;

public class GeneratedTestGet {

    private static final Document document = new Document();

    @Test
    public void testGet() {
        String key = "test";
        String value = "Hello, World!";
        Attributes attributes = new Attributes(document);
        assertEquals(value, attributes.get(key));
    }

}