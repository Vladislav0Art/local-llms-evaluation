package org.jsoup.nodes;

public class GeneratedTestAddAll_AddsAttributesToAttributes {

    private Attributes attributes;

    @Test
    public void testAddAll_AddsAttributesToAttributes() {
        Attributes newAttributes = new Attributes();
        newAttributes.add("key2", "value2");
        assertEquals(1, attributes.size());
        assertTrue(newAttributes.containsValue("key2"));
    }

}