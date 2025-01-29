package org.jsoup.nodes;

public class GeneratedTestAdd {

    @Test
    public void testAdd() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        assertEquals("value", attributes.getUserData("key"));
        assertEquals(true, attributes.hasDeclaredValueForKey("key"));
    }

}