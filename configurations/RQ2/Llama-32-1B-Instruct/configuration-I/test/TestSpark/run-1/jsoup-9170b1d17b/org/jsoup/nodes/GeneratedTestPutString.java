package org.jsoup.nodes;

public class GeneratedTestPutString {

    @Test
    public void testPutString() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        assertEquals("value1", attributes.getUserData("key1"));
        assertNull(attributes.getUserData(""));
    }

}