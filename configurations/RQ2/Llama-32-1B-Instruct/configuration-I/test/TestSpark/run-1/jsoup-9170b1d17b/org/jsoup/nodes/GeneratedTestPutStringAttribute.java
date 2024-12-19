package org.jsoup.nodes;

public class GeneratedTestPutStringAttribute {

    @Test
    public void testPutStringAttribute() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        assertEquals("value1", attributes.get("key1"));
        assertNull(attributes.getUserData(""));
    }

}