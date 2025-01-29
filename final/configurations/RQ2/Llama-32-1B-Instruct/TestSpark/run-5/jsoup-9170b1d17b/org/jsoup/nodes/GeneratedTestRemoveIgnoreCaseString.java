package org.jsoup.nodes;

public class GeneratedTestRemoveIgnoreCaseString {

    @Test
    public void testRemoveIgnoreCaseString() {
        Attributes attributes = new Attributes();
        attributes.removeIgnoreCase("key");
        assertNull(attributes.getIgnoreCase("key"));
    }

}