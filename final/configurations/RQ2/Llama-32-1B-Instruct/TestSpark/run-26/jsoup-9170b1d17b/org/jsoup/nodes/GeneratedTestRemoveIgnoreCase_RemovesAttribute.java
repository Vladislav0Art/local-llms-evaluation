package org.jsoup.nodes;

public class GeneratedTestRemoveIgnoreCase_RemovesAttribute {

    private Attributes attributes;

    @Test
    public void testRemoveIgnoreCase_RemovesAttribute() {
        String key = "key1";
        attributes.removeIgnoreCase(key);
        assertTrue(attributes.isEmpty());
    }

}