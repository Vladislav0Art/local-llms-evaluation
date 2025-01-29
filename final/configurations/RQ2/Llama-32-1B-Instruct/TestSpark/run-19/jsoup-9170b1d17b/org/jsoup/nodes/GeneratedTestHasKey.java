package org.jsoup.nodes;

public class GeneratedTestHasKey {

    private static final Document document = new Document();

    @Test
    public void testHasKey() {
        String key = "test";
        Attributes attributes = new Attributes(document);
        assertFalse(attributes.hasKey(key));
        attributes.add("key", "value");
        assertTrue(attributes.hasKey(key));
    }

}