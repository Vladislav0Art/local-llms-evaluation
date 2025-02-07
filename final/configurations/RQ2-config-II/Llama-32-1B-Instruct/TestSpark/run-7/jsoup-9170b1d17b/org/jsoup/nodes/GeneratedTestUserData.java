package org.jsoup.nodes;

public class GeneratedTestUserData {

    @Test
    public void testUserData() {
        Attributes attributes = new Attributes();
        attributes.getUserData("user");
        assertEquals("user", attributes.getUserData("user"));
    }

}