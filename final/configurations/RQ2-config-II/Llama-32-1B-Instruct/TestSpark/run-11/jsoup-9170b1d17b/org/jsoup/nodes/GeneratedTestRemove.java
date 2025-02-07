package org.jsoup.nodes;

public class GeneratedTestRemove {

    @Test
    public void testRemove() {
        Attributes attributes = new Attributes();
        attributes.remove("key");
        assertEquals(0, attributes.size());
    }

}