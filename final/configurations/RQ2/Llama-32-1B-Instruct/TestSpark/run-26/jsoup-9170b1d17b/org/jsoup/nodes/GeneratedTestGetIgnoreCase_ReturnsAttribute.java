package org.jsoup.nodes;

public class GeneratedTestGetIgnoreCase_ReturnsAttribute {

    private Attributes attributes;

    @Test
    public void testGetIgnoreCase_ReturnsAttribute() {
        String key = "key1";
        String value = "value1";
        attributes.put(key, value);
        assertEquals(value, attributes.getIgnoreCase(key));
    }

}