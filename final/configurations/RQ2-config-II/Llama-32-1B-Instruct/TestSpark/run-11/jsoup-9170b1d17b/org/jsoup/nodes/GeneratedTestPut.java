package org.jsoup.nodes;

public class GeneratedTestPut {

    @Test
    public void testPut() {
        Attributes attributes = new Attributes();
        assertEquals("", attributes.put("key", true));
        assertEquals(true, attributes.put("keyElseValue", false));
    }

}