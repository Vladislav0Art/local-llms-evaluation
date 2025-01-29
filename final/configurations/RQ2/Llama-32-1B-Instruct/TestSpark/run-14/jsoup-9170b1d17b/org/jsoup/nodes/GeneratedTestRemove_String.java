package org.jsoup.nodes;

public class GeneratedTestRemove_String {

    private Attributes attributes;

    @Test
    public void testRemove_String() {
        attributes = new Attributes();
        String key = "testKey";
        attributes.remove(key);
        assertFalse(attributes.containsKey(key));
    }

}