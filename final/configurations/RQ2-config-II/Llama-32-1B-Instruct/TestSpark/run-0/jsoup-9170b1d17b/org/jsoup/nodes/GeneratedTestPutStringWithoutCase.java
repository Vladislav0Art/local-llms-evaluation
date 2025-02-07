package org.jsoup.nodes;

public class GeneratedTestPutStringWithoutCase {

    private Attributes attributes;

    @Test
    public void testPutStringWithoutCase() {
        String key = "testKey";
        Object value = null;
        attributes.put(key, value);
        assertEquals(value, attributes.getUserData(key));
    }

}