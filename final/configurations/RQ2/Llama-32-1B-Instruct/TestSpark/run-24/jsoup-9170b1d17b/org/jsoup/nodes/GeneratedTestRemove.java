package org.jsoup.nodes;

public class GeneratedTestRemove {

    @Test
    public void testRemove() {
        Attributes attributes = new Attributes();
        attributes.remove("key");
        assertFalse(attributes.hasDeclaredValueForKey("key"));
        assertFalse(attributes.isEmpty());
    }

}