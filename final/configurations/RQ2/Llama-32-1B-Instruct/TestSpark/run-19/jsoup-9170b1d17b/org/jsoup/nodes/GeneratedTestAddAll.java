package org.jsoup.nodes;

public class GeneratedTestAddAll {

    private static final Document document = new Document();

    @Test
    public void testAddAll() {
        List<Attribute> attributesList = new ArrayList<>();
        attributesList.add(new Attribute("attribute1"));
        String key = "test";
        Attributes attributes = new Attributes(document);
        attributes.addAll(attributesList);
        assertEquals(2, attributes.size());

        Attribute attribute = new Attribute("attribute2");
        attributes.add(attribute);

        for (Attribute a : attributes) {
            assertTrue(a != null);
        }
    }

}