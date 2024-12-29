package org.jsoup.nodes;

public class GeneratedTestRemoveAttribute {

    @Test
    public void testRemoveAttribute() {
        Attributes attributes = new Attributes();
        attributes.remove("key");
        assertEquals(1, attributes.size());
    }

}