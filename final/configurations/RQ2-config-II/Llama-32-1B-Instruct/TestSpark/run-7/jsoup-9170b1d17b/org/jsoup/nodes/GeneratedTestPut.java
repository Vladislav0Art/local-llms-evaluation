package org.jsoup.nodes;

public class GeneratedTestPut {

    @Test
    public void testPut() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals("value", attributes.getUserData("key"));
    }

}