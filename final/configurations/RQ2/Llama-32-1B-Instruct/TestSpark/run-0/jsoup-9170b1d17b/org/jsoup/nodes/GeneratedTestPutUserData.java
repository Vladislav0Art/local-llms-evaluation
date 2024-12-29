package org.jsoup.nodes;

public class GeneratedTestPutUserData {

    @Test
    public void testPutUserData() {
        Attributes attributes = new Attributes();
        String key = "key";
        Object userData = "value";
        attributes.putUserData(key, userData);
        assertEquals(userData, attributes.getUserData(key));
    }

}