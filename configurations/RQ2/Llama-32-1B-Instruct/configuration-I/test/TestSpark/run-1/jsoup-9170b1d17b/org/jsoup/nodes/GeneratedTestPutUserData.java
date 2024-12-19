package org.jsoup.nodes;

public class GeneratedTestPutUserData {

    @Test
    public void testPutUserData() {
        Attributes attributes = new Attributes();
        attributes.putUserData("key3", "value3");
        assertEquals("value3", attributes.getUserData("key3"));
        assertNull(attributes.getUserData(""));
    }

}