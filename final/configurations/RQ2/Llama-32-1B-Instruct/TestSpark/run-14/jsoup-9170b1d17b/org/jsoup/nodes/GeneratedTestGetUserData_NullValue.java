package org.jsoup.nodes;

public class GeneratedTestGetUserData_NullValue {

    private Attributes attributes;

    @Test
    public void testGetUserData_NullValue() {
        attributes = new Attributes();
        String key = "testKey";
        String value = null;
        Object result = attributes.getUserData(key);
        assertNull(result);
    }

}