package org.jsoup.nodes;

public class GeneratedPutBooleanValue_PuttingFalse_SetsAttributesAsFalse {

    @Test
    public void putBooleanValue_PuttingFalse_SetsAttributesAsFalse() {
        Attributes attributes = new Attributes();
        attributes.put("key", false);
        assertFalse(attributes.hasKey("key"));
    }

}