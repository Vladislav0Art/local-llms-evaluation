package org.jsoup.nodes;

public class GeneratedTestAddAttributeWithoutCase {

    private Attributes attributes;

    @Test
    public void testAddAttributeWithoutCase() {
        String key = "testKey";
        Attribute attribute = new Attributes();
        attributes.add(key, attribute);
        assertEquals(attribute, attributes.getUserData(key));
    }

}