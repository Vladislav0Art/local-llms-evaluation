package org.jsoup.nodes;

public class GeneratedTestRemoveIgnoreCaseString {

    @Test
    public void testRemoveIgnoreCaseString() {
        Attributes attributes = new Attributes();
        attributes.removeIgnoreCase("Key1");
        assertNull(attributes.getUserData("Key1"));
        assertNotNull(attributes);
    }

}