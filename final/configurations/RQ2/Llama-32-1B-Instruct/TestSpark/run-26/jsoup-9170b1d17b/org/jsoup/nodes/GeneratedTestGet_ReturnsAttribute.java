package org.jsoup.nodes;

public class GeneratedTestGet_ReturnsAttribute {

    private Attributes attributes;

    @Test
    public void testGet_ReturnsAttribute() {
        String key = "key1";
        Object value = "value1";
        attributes.put(key, value);
        assertEquals(value, attributes.get(key));
    }

}