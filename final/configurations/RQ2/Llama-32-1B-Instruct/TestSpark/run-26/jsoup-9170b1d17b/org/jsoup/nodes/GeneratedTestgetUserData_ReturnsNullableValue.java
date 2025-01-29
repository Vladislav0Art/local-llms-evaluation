package org.jsoup.nodes;

public class GeneratedTestgetUserData_ReturnsNullableValue {

    private Attributes attributes;

    @Test
    public void testgetUserData_ReturnsNullableValue() {
        String key = "key1";
        Object value = null;
        attributes.putUserData(key, value);
        assertEquals(value, attributes.getUserData(key));
    }

}