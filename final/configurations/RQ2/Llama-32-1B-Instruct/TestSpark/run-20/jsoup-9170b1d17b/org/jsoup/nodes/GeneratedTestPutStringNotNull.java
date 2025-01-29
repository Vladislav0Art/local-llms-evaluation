package org.jsoup.nodes;

public class GeneratedTestPutStringNotNull {

    @Test
    public void testPutStringNotNull() {
        Attributes attributes = new Attributes();
        String key = "key";
        Object value = "value";
        assertEquals(null, attributes.put(key, null));
        assertEquals("value", attributes.put(key, value));
    }

}