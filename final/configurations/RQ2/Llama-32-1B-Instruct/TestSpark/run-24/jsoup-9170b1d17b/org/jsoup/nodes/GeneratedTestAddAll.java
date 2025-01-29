package org.jsoup.nodes;

public class GeneratedTestAddAll {

    @Test
    public void testAddAll() {
        Attributes attributes = new Attributes();
        String[] keys = {"key1", "key2"};
        for (String key : keys) {
            attributes.add(key);
        }
        assertNotEquals("", attributes.getUserData(keys[0]));
        assertNotEquals("", attributes.getUserData(keys[1]));
    }

}