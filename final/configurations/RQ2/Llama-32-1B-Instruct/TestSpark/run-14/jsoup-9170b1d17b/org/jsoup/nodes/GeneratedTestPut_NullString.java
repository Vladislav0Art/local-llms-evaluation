package org.jsoup.nodes;

public class GeneratedTestPut_NullString {

    private Attributes attributes;

    @Test
    public void testPut_NullString() {
        attributes = new Attributes();
        String key = "testKey";
        Object value = null;
        attributes.put(key, value);
        assertNull(attributes.getUserData(key));
    }

}