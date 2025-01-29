package org.jsoup.nodes;

public class GeneratedTestIsEmpty {

    private static final Document document = new Document();

    @Test
    public void testIsEmpty() {
        String key = "test";
        Attributes attributes = new Attributes(document);
        assertTrue(attributes.isEmpty());
        attributes.add("key1", "value1");
        assertFalse(attributes.isEmpty());
    }

}