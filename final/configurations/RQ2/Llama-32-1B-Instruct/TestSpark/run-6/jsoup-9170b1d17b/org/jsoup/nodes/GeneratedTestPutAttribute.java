package org.jsoup.nodes;

public class GeneratedTestPutAttribute {

    @Test
    public void testPutAttribute() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Object attribute = "attribute";
        attributes.put(attribute);
        assertTrue(attributes.hasDeclaredValueForKey("key"));
        assertEquals("attribute", attributes.getUserData("key"));
    }

}