package org.jsoup.nodes;

public class GeneratedTestGetStringAttribute {

    private Attributes attributes;

    @Test
    public void testGetStringAttribute() {
        String key = "test";
        Attribute attribute = new Attr("test", "value");
        Object expectedValue = "value";
        Object actualValue = attributes.get(key);
        assertTrue(actualValue instanceof Attr);
        assertEquals(expectedValue, ((Attr) actualValue).getValue());
    }

}