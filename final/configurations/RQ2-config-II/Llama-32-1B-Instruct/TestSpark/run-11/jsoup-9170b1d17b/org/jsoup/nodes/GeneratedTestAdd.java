package org.jsoup.nodes;

public class GeneratedTestAdd {

    @Test
    public void testAdd() {
        Attributes attributes = new Attributes();
        assertEquals("", attributes.add("key", "value"));
        assertEquals("value", attributes.add("keyElseValue", "value"));
    }

}