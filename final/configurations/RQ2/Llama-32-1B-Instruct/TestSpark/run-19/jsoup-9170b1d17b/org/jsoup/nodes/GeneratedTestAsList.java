package org.jsoup.nodes;

public class GeneratedTestAsList {

    private static final Document document = new Document();

    @Test
    public void testAsList() {
        String key = "test";
        Attributes attributes = new Attributes(document);
        List<Attribute> attributesList = new ArrayList<>();
        attributesList.add(new Attribute("attribute1"));
        attributesList.add(new Attribute("attribute2"));
        String value = "value";
        for (int i = 0; i < attributes.size(); i++) {
            assertTrue(attributes.get(i) != null);
            assertEquals(value, attributes.get(i).getValue(key));
        }
    }

}