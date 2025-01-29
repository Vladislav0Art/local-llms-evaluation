package org.jsoup.nodes;

public class GeneratedTestRemoveAllValues {

    private Attributes attributes;

    @Test
    public void testRemoveAllValues() {
        attributes = new Attributes();
        String key1 = "testKey1";
        Object attribute1 = "testAttribute1";
        Object value1 = "testValue1";
        attributes.add(key1, value1);
        attributes.remove(key1);

        List<Object> list = attributes.asList();
        assertEquals(0, list.size());
    }

}