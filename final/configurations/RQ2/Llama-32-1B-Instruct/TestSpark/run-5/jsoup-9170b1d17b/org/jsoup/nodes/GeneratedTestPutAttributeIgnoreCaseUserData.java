package org.jsoup.nodes;

public class GeneratedTestPutAttributeIgnoreCaseUserData {

    @Test
    public void testPutAttributeIgnoreCaseUserData() {
        Attributes attributes = new Attributes();
        String key = "testKey";
        Object value = new String("testValue");
        attributes.putIgnoreCase(key, value);
        assertEquals(value, attributes.getIgnoreCase(key));
    }

}