package org.jsoup.nodes;

public class GeneratedTestPutIgnoreCase {

    @Test
    public void testPutIgnoreCase() {
        Attributes attributes = new Attributes();
        assertEquals("", attributes.putIgnoreCase("key", true));
        assertEquals(true, attributes.putIgnoreCase("keyElseValue", false));
    }

}