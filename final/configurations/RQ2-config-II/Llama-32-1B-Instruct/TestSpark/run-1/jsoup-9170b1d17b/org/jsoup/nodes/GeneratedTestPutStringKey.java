package org.jsoup.nodes;

public class GeneratedTestPutStringKey {

    @Test
    public void testPutStringKey() {
        String key = "test";
        Object value = "value";
        Attributes attributes = new Attributes();
        attributes.put(key, value);
        assertEquals(value, attributes.getUserData(key));
        assertEquals(value, org.jsoup.nodes.Attributes.getValue(key));
    }

}