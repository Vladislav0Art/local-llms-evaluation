package org.jsoup.nodes;

public class GeneratedTestGetInternalAttribute {

    private Attributes attributes;

    @Test
    public void testGetInternalAttribute() {
        String key = "test";
        Object expectedValue = null;
        Object actualValue = attributes.get(key);
        assertTrue(actualValue instanceof String);
        assertEquals(expectedValue, actualValue.toString());
    }

}