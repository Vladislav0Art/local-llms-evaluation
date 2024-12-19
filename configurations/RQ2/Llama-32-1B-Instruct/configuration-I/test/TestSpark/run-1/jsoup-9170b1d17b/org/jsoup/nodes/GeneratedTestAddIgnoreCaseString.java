package org.jsoup.nodes;

public class GeneratedTestAddIgnoreCaseString {

    @Test
    public void testAddIgnoreCaseString() {
        Attributes attributes = new Attributes();
        attributes.add("Key2", "Value2");
        assertEquals("Value2", attributes.getUserData("Key2"));
        assertNotNull(attributes);
    }

}