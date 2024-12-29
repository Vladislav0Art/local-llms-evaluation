package org.jsoup.nodes;

public class GeneratedTestGet {

    @Test
    public void testGet() {
        Attributes attributes = new Attributes();
        String key = "key";
        String value = "value";
        attributes.put(key, value);
        assertEquals(value, attributes.get(key));
    }

}