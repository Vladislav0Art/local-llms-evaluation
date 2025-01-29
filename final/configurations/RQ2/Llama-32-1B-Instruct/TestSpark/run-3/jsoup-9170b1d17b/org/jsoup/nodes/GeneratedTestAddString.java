package org.jsoup.nodes;

public class GeneratedTestAddString {

    // ...

    @Test
    public void testAddString() {
        Attributes attributes = new Attributes();
        String key = "testKey";
        String value = "testValue";
        attributes.add(key, value);
        assert attributes.size() == 1;
    }

}