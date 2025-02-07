package org.jsoup.nodes;

public class GeneratedTestGetAttributes {

    @Test
    public void testGetAttributes() {
        String key = "test";
        String value = "value";
        Attributes attributes = new Attributes();
        attributes.add(key, value);
        assertEquals(value, attributes.getUserData(key));
    }

}