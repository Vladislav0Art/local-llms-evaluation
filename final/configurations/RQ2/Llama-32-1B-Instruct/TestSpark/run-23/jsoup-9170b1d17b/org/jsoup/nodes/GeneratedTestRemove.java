package org.jsoup.nodes;

public class GeneratedTestRemove {

    @Test
    public void testRemove() {
        Attributes attributes = new Attributes();
        attributes.remove("attribute1");
        assertTrue(!attributes.containsKey("attribute1"));
    }

}