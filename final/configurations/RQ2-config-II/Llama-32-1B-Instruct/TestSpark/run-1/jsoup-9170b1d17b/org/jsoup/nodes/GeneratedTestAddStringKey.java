package org.jsoup.nodes;

public class GeneratedTestAddStringKey {

    @Test
    public void testAddStringKey() {
        String key = "test";
        String value = "value";
        Attributes attributes = new Attributes();
        attributes.addStringKey(key, value);
        assertEquals(value, attributes.getUserData(key));
        assertEquals(value, org.jsoup.nodes.Attributes.getValue(key));
    }

}