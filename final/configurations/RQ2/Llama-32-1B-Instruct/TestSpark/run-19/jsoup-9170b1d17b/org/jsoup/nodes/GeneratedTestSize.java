package org.jsoup.nodes;

public class GeneratedTestSize {

    private static final Document document = new Document();

    @Test
    public void testSize() {
        String key = "test";
        Attributes attributes = new Attributes(document);
        assertEquals(0, attributes.size());
        attributes.put("key1", "value1");
        assertEquals(1, attributes.size());
    }

}