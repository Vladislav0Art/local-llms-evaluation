package org.jsoup.nodes;

public class GeneratedTestGetNonInternalAttribute {

    private Attributes attributes;

    @Test
    public void testGetNonInternalAttribute() {
        String key = "test";
        Object expectedValue = null;
        Object actualValue = attributes.getUserData(key);
        assertEquals(expectedValue, actualValue);
    }

}