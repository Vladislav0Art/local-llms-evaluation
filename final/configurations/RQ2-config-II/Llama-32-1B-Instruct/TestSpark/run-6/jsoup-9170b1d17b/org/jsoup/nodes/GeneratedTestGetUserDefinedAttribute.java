package org.jsoup.nodes;

public class GeneratedTestGetUserDefinedAttribute {

    private Attributes attributes;

    @Test
    public void testGetUserDefinedAttribute() {
        String key = "test";
        Object expectedValue = null;
        Object actualValue = attributes.getUserData(key);
        assertTrue(actualValue instanceof Object);
        assertNotNull(actualValue);
    }

}