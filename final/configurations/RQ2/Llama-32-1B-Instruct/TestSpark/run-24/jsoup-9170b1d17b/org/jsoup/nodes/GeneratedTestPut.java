package org.jsoup.nodes;

public class GeneratedTestPut {

    @Test
    public void testPut() {
        Attributes attributes = new Attributes();
        String key = "test";
        String value = "hello";
        attributes.put(key, value);
        assertEquals(value, attributes.getUserData(key));
        assertEquals(true, attributes.hasDeclaredValueForKey(key));
    }

}