package org.jsoup.nodes;

public class GeneratedTestGetStringKey {

    @Test
    public void testGetStringKey() {
        String key = "test";
        String value = "value";
        Attributes attributes = new Attributes();
        attributes.add(key, value);
        assertEquals(value, attributes.get(key));
        assertEquals(value, org.jsoup.nodes.Attributes.get(key));
    }

}