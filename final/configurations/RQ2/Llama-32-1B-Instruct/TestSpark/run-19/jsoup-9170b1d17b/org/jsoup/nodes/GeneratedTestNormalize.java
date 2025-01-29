package org.jsoup.nodes;

public class GeneratedTestNormalize {

    private static final Document document = new Document();

    @Test
    public void testNormalize() {
        String key = "test";
        Attributes attributes = new Attributes(document);
        attributes.normalize();
        assertTrue(attributes.isEmpty());
    }

}