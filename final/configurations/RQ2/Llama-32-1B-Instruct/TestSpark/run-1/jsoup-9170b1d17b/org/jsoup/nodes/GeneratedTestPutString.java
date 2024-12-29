package org.jsoup.nodes;

public class GeneratedTestPutString {

    @Test
    public void testPutString() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals("value", attributes.get("key"));
    }

}