package org.jsoup.nodes;

public class GeneratedTestRemove_RemovesAttribute {

    private Attributes attributes;

    @Test
    public void testRemove_RemovesAttribute() {
        String key = "key1";
        attributes.remove(key);
        assertTrue(attributes.isEmpty());
    }

}