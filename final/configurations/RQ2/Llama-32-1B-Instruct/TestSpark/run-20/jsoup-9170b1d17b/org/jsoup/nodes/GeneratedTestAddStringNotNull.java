package org.jsoup.nodes;

public class GeneratedTestAddStringNotNull {

    @Test
    public void testAddStringNotNull() {
        Attributes attributes = new Attributes();
        String key = "key";
        Object value = "value";
        attributes.add(key, value);
        assertEquals(value, attributes.getUserData(key));
    }

}