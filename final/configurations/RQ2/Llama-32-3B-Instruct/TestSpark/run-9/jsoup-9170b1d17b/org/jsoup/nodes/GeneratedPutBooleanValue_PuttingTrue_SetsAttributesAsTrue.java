package org.jsoup.nodes;

public class GeneratedPutBooleanValue_PuttingTrue_SetsAttributesAsTrue {

    @Test
    public void putBooleanValue_PuttingTrue_SetsAttributesAsTrue() {
        Attributes attributes = new Attributes();
        attributes.put("key", true);
        assertTrue(attributes.hasKey("key"));
    }

}