package org.jsoup.nodes;

public class GeneratedTestHasKeyIgnoreCase {

    private static final Document document = new Document();

    @Test
    public void testHasKeyIgnoreCase() {
        String key = "TEST";
        Attributes attributes = new Attributes(document);
        assertFalse(attributes.hasKeyIgnoreCase(key));
        attributes.put("key", "value");
        assertTrue(attributes.hasKeyIgnoreCase(key));
    }

}