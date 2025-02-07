package org.jsoup.nodes;

public class GeneratedTestGetIgnoreCaseStringKey {

    @Test
    public void testGetIgnoreCaseStringKey() {
        String key = "TEST";
        String value = "value";
        Attributes attributes = new Attributes();
        attributes.add(key, value);
        assertEquals(value, attributes.getIgnoreCase(key));
        assertEquals(value, org.jsoup.nodes.Attributes.getIgnoreCase(key));
    }

}