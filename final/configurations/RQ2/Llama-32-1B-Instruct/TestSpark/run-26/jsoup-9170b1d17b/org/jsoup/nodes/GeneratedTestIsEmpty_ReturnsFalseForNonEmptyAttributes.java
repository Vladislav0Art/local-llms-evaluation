package org.jsoup.nodes;

public class GeneratedTestIsEmpty_ReturnsFalseForNonEmptyAttributes {

    private Attributes attributes;

    @Test
    public void testIsEmpty_ReturnsFalseForNonEmptyAttributes() {
        String key = "key1";
        Object value = null;
        attributes.put(key, value);
        assertFalse(attributes.isEmpty());
    }

}