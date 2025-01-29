package org.jsoup.nodes;

public class GeneratedTestGetValueAsAttribute {

    private static final Document document = new Document();

    @Test
    public void testGetValueAsAttribute() {
        String key = "test";
        String value = "Hello, World!";
        Attributes attributes = new Attributes(document);
        assertEquals(Attributes.class, attributes.getType());
        assertTrue(attributes.getValue(key) instanceof Attribute);
    }

}