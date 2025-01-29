package org.jsoup.nodes;

public class GeneratedTestAdd_Attribute {

    private Attributes attributes;

    @Test
    public void testAdd_Attribute() {
        attributes = new Attributes();
        String key = "testKey";
        Object attribute = "testAttribute";
        attributes.add(key, attribute);
        assertEquals(attribute, attributes.get(key));
    }

}