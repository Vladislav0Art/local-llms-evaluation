package org.jsoup.nodes;

public class GeneratedTestRemoveString {

    @Test
    public void testRemoveString() {
        Attributes attributes = new Attributes();
        String value = "value";
        attributes.remove("key");
        assertFalse(attributes.hasKey("key"));
    }

}