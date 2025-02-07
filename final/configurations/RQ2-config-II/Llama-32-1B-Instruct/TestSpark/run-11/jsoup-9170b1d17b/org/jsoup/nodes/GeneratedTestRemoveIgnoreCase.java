package org.jsoup.nodes;

public class GeneratedTestRemoveIgnoreCase {

    @Test
    public void testRemoveIgnoreCase() {
        Attributes attributes = new Attributes();
        attributes.removeIgnoreCase("key");
        assertEquals(0, attributes.size());
    }

}