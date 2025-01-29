package org.jsoup.nodes;

public class GeneratedTestRemoveAttribute {

    @Test
    public void testRemoveAttribute() {
        Attributes attributes = new Attributes();
        Object attribute = "attribute";
        attributes.put(attribute);
        attributes.remove(attribute);
        assertFalse(attributes.hasDeclaredValueForKey(attribute));
    }

}