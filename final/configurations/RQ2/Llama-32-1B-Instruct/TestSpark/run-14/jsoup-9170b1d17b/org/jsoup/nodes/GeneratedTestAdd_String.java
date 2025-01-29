package org.jsoup.nodes;

public class GeneratedTestAdd_String {

    private Attributes attributes;

    @Test
    public void testAdd_String() {
        attributes = new Attributes();
        String key = "testKey";
        String value = "testValue";
        attributes.add(key, value);
        assertEquals(value, attributes.get(key));
    }

}