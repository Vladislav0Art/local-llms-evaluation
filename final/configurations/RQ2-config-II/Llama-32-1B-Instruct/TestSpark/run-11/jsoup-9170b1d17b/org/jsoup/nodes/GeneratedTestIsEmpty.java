package org.jsoup.nodes;

public class GeneratedTestIsEmpty {

    @Test
    public void testIsEmpty() {
        Attributes attributes = new Attributes();
        assertFalse(attributes.isEmpty());
        attributes.remove("key");
        assertTrue(attributes.isEmpty());
    }

}