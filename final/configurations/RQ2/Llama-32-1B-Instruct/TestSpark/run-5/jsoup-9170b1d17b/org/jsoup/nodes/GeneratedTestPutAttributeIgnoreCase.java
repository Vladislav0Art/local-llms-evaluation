package org.jsoup.nodes;

public class GeneratedTestPutAttributeIgnoreCase {

    @Test
    public void testPutAttributeIgnoreCase() {
        Attributes attributes = new Attributes();
        String key = "testKey";
        String value = "testValue";
        attributes.putIgnoreCase(key, value);
        assertEquals(value, attributes.getIgnoreCase(key));
    }

}