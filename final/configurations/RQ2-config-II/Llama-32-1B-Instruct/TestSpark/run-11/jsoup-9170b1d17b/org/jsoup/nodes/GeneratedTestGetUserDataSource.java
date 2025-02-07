package org.jsoup.nodes;

public class GeneratedTestGetUserDataSource {

    @Test
    public void testGetUserDataSource() {
        Attributes attributes = new Attributes();
        assertEquals(null, attributes.getUserData("key"));
        assertEquals("value", attributes.getUserData("keyElseValue"));
    }

}