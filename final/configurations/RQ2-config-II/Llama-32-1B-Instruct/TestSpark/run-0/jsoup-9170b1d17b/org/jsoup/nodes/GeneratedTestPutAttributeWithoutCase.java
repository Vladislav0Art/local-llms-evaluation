package org.jsoup.nodes;

public class GeneratedTestPutAttributeWithoutCase {

    private Attributes attributes;

    @Test
    public void testPutAttributeWithoutCase() {
        String key = "testKey";
        Attribute attribute = new Attributes();
        attributes.put(key, attribute);
        assertEquals(attribute, attributes.getUserData(key));
    }

}