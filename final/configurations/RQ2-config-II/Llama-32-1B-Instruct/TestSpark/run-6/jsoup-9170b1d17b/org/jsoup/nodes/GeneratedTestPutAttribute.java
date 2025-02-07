package org.jsoup.nodes;

public class GeneratedTestPutAttribute {

    private Attributes attributes;

    @Test
    public void testPutAttribute() {
        String key = "test";
        Object value = "value";
        Attributes attributes2 = new Attributes();
        attributes.put(key, value);
        assertEquals(value, attributes2.getUserData(key));
    }

}