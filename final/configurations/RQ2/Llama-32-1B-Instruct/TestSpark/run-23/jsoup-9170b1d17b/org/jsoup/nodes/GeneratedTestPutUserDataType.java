package org.jsoup.nodes;

public class GeneratedTestPutUserDataType {

    @Test
    public void testPutUserDataType() {
        Attributes attributes = new Attributes();
        attributes.putUserData("key", "user value");
        assertEquals("user value", attributes.getUserData("key"));
    }

}