package org.jsoup.nodes;

public class GeneratedTestPutStringWithoutNotNull {

    @Test
    public void testPutStringWithoutNotNull() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals("value", attributes.get("key"));
    }

}