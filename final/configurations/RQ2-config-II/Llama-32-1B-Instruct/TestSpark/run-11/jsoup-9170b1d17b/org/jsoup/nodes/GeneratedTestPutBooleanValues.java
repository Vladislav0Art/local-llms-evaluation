package org.jsoup.nodes;

public class GeneratedTestPutBooleanValues {

    @Test
    public void testPutBooleanValues() {
        Attributes attributes = new Attributes();
        attributes.put("key", true);
        assertNotEquals(null, attributes.getUserData("keyElseValue"));
    }

}