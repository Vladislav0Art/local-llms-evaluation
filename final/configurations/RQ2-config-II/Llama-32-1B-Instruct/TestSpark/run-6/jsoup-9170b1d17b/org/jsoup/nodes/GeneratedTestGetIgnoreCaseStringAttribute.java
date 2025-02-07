package org.jsoup.nodes;

public class GeneratedTestGetIgnoreCaseStringAttribute {

    private Attributes attributes;

    @Test
    public void testGetIgnoreCaseStringAttribute() {
        String key = "TEST";
        Attribute attribute = new Attr("test", "value");
        Object expectedValue = "value";
        Object actualValue = attributes.getIgnoreCase(key);
        assertTrue(actualValue instanceof Attr);
        assertEquals(expectedValue, ((Attr) actualValue).getValue());
    }

}