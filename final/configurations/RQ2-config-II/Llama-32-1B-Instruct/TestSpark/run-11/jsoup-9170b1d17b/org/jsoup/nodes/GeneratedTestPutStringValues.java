package org.jsoup.nodes;

public class GeneratedTestPutStringValues {

    @Test
    public void testPutStringValues() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertNotEquals("", attributes.put("keyElseValue", "value"));
    }

}