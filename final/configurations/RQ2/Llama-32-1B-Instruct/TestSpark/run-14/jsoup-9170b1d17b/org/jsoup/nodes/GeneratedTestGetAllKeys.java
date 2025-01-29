package org.jsoup.nodes;

public class GeneratedTestGetAllKeys {

    private Attributes attributes;

    @Test
    public void testGetAllKeys() {
        attributes = new Attributes();
        String key = "testKey1";
        String value = "testValue1";
        attributes.add(key, value);
        assertEquals(value, attributes.get(key));

        key = "testKey2";
        Object attribute = "testAttribute2";
        attributes.add(key, attribute);

        List<Attribute> list = attributes.asList();
        assertEquals(2, list.size());
    }

}