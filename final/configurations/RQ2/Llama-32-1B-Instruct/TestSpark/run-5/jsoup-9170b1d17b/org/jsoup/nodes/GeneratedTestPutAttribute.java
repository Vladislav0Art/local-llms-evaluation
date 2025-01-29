package org.jsoup.nodes;

public class GeneratedTestPutAttribute {

    @Test
    public void testPutAttribute() {
        Attributes attributes = new Attributes();
        String key = "testKey";
        String value = "testValue";
        attributes.put(key, value);
        assertEquals(value, attributes.get(key));
    }

}