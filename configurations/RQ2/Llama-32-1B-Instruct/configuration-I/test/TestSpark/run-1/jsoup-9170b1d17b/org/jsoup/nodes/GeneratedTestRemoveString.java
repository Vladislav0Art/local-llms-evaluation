package org.jsoup.nodes;

public class GeneratedTestRemoveString {

    @Test
    public void testRemoveString() {
        Attributes attributes = new Attributes();
        attributes.remove("key1");
        assertNull(attributes.get("key1"));
        assertNotNull(attributes);
    }

}