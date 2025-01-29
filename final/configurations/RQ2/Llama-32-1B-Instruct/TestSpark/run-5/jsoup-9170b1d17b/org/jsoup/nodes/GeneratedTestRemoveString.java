package org.jsoup.nodes;

public class GeneratedTestRemoveString {

    @Test
    public void testRemoveString() {
        Attributes attributes = new Attributes();
        attributes.remove("key");
        assertNull(attributes.get("key"));
    }

}