package org.jsoup.nodes;

public class GeneratedTestAddString {

    @Test
    public void testAddString() {
        Attributes attributes = new Attributes();
        attributes.add("key2", "value2");
        assertEquals("value2", attributes.getUserData("key2"));
        assertNotNull(attributes);
    }

}