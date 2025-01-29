package org.jsoup.nodes;

public class GeneratedTestGetValueAsString {

    private static final Document document = new Document();

    @Test
    public void testGetValueAsString() {
        String key = "test";
        String value = "Hello, World!";
        Attributes attributes = new Attributes(document);
        assertEquals(value.toString(), attributes.getValue(key));
    }

}