package org.jsoup.nodes;

public class GeneratedTestPut_String {

    private Attributes attributes;

    @Test
    public void testPut_String() {
        attributes = new Attributes();
        String key = "testKey";
        String value = "testValue";
        attributes.put(key, value);
        assertEquals(value, attributes.get(key));
    }

}