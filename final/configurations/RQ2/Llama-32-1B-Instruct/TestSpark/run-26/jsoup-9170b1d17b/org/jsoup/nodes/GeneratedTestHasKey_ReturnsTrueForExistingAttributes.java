package org.jsoup.nodes;

public class GeneratedTestHasKey_ReturnsTrueForExistingAttributes {

    private Attributes attributes;

    @Test
    public void testHasKey_ReturnsTrueForExistingAttributes() {
        String key = "key1";
        attributes.put("key2", "value2");
        assertTrue(attributes.hasKey(key));
    }

}