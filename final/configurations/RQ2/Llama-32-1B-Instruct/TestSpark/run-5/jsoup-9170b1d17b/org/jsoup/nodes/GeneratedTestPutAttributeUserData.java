package org.jsoup.nodes;

public class GeneratedTestPutAttributeUserData {

    @Test
    public void testPutAttributeUserData() {
        Attributes attributes = new Attributes();
        String key = "testKey";
        Object value = new String("testValue");
        attributes.put(key, value);
        assertEquals(value, attributes.get(key));
    }

}