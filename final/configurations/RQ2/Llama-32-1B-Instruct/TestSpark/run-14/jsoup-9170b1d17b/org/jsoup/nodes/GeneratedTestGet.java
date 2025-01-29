package org.jsoup.nodes;

public class GeneratedTestGet {

    private Attributes attributes;

    @Test
    public void testGet() {
        attributes = new Attributes();
        String key = "testKey";
        String value = "testValue";
        attributes.put(key, value);
        assertEquals(value, attributes.get(key));
    }

}