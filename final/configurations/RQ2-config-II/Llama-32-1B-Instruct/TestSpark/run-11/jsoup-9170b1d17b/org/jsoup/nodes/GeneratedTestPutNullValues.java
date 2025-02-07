package org.jsoup.nodes;

public class GeneratedTestPutNullValues {

    @Test
    public void testPutNullValues() {
        Attributes attributes = new Attributes();
        attributes.put("key", null);
        assertEquals(null, attributes.getUserData("key"));
    }

}