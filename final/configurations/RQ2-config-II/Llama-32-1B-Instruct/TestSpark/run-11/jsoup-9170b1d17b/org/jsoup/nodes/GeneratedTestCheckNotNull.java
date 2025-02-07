package org.jsoup.nodes;

public class GeneratedTestCheckNotNull {

    @Test
    public void testCheckNotNull() {
        Attributes attributes = new Attributes();
        assertEquals("", checkNotNull(attributes.getUserData("key")));
        assertEquals("value", checkNotNull(attributes.getUserData("keyElseValue")));
    }

}