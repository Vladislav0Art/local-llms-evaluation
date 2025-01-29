package org.jsoup.nodes;

public class GeneratedTestAdd_AddsAttributeToAttributes {

    private Attributes attributes;

    @Test
    public void testAdd_AddsAttributeToAttributes() {
        Attributes newAttributes = new Attributes();
        newAttributes.add("key2", "value2");
        assertEquals(1, attributes.size());
        assertTrue(attributes.containsValue("key2"));
    }

}