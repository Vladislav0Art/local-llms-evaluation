package org.jsoup.nodes;

public class GeneratedTestRemoveAllKeys {

    private Attributes attributes;

    @Test
    public void testRemoveAllKeys() {
        attributes = new Attributes();
        String key1 = "testKey1";
        String value1 = "testValue1";
        Object attribute1 = "testAttribute1";
        attributes.add(key1, value1);
        attributes.remove(key1);

        List<Attribute> list = attributes.asList();
        assertEquals(0, list.size());
    }

}