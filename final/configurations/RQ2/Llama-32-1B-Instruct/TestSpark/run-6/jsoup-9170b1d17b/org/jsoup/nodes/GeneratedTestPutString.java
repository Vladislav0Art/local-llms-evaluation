package org.jsoup.nodes;

public class GeneratedTestPutString {

    @Test
    public void testPutString() {
        Attributes attributes = new Attributes();
        String value = "value";
        attributes.put("key", value);
        assertTrue(attributes.hasKey("key"));
        assertEquals(value, attributes.get("key"));
    }

}