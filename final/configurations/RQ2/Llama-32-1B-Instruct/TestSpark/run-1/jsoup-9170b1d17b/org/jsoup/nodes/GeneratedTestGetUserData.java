package org.jsoup.nodes;

public class GeneratedTestGetUserData {

    @Test
    public void testGetUserData() {
        Attributes attributes = new Attributes();
        attributes.put("user_data", "value");
        assertEquals("value", attributes.getUserData("user_data"));
    }

}