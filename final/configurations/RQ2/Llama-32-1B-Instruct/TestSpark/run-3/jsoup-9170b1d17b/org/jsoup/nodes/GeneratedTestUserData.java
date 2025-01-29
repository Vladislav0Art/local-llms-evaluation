package org.jsoup.nodes;

public class GeneratedTestUserData {

    // ...

    @Test
    public void testUserData() {
        Attributes attributes = new Attributes();
        String key = "testKey";
        Object value = "testValue";
        attributes.getUserData(key, value);
        assertEquals("testValue", value);
    }

}