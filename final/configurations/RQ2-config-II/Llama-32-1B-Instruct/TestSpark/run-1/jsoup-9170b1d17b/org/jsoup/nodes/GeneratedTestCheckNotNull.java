package org.jsoup.nodes;

public class GeneratedTestCheckNotNull {

    @Test
    public void testCheckNotNull() {
        Attributes attributes = new Attributes();
        assertEquals("", org.jsoup.nodes.Attributes.checkNotNull(attributes.getUserData("key")));
        assertEquals(null, org.jsoup.nodes.Attributes.checkNotNull(null));
    }

}