package org.jsoup.nodes;

public class GeneratedTestPutString {

    // ...

    @Test
    public void testPutString() {
        Attributes attributes = new Attributes();
        String key = "testKey";
        String value = "testValue";
        attributes.put(key, value);
        assert attributes.get(key) == value;
    }

}