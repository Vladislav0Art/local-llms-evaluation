package org.jsoup.nodes;

public class GeneratedTestPutUserData {

    @Test
    public void testPutUserData() {
        Attributes attributes = new Attributes();
        String key = "test";
        Object value = "hello";
        attributes.putUserData(key, value);
        assertNotEquals("", attributes.getUserData(key));
    }

}