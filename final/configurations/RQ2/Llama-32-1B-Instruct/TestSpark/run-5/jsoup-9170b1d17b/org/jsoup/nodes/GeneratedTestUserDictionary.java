package org.jsoup.nodes;

public class GeneratedTestUserDictionary {

    @Test
    public void testUserDictionary() {
        Attributes attributes = new Attributes();
        String key = "testKey";
        Object value = new String("testValue");
        attributes.putUserData(key, value);
        assertEquals("testValue", attributes.getUserData(key));
    }

}