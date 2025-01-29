package org.jsoup.nodes;

public class GeneratedTestGetAllValues {

    private Attributes attributes;

    @Test
    public void testGetAllValues() {
        attributes = new Attributes();
        String key = "testKey1";
        String value = "testValue1";
        Object attribute = "testAttribute2";
        attributes.add(key, value);
        Object result = attributes.getUserData(key);
        assertEquals(value, result);

        key = "testKey2";
        attribute = "testAttribute3";
        attributes.add(key, attribute);

        List<Object> list = attributes.asList();
        assertEquals(2, list.size());
    }

}