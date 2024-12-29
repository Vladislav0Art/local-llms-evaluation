package org.jsoup.nodes;

public class GeneratedTestPut {

    @Test
    public void testPut() {
        Attributes attributes = new Attributes();
        String key = "key";
        Object value = "value";
        attributes.put(key, value);
        assertEquals(value, attributes.getValue(key));
    }

}