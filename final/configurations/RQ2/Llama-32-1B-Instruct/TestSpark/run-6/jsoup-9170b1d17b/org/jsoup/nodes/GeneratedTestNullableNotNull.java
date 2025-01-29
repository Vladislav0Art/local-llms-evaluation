package org.jsoup.nodes;

public class GeneratedTestNullableNotNull {

    @Test
    public void testNullableNotNull() {
        Attributes attributes = new Attributes();
        Object value = "value";
        attributes.putUserData("key", value);
        assertTrue(attributes.checkNotNull(value));
    }

}