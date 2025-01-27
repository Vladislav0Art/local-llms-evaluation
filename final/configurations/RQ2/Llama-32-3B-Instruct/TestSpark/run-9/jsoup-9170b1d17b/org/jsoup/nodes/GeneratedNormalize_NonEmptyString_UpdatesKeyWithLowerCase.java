package org.jsoup.nodes;

public class GeneratedNormalize_NonEmptyString_UpdatesKeyWithLowerCase {

    @Test
    public void normalize_NonEmptyString_UpdatesKeyWithLowerCase() {
        Attributes attributes = new Attributes();
        attributes.put("KEY", "value");
        attributes.normalize();
        assertTrue(attributes.hasKey("key"));
    }

}