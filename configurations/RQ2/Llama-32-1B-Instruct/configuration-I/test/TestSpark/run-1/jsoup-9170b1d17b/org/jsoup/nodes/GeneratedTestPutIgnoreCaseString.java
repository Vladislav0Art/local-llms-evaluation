package org.jsoup.nodes;

public class GeneratedTestPutIgnoreCaseString {

    @Test
    public void testPutIgnoreCaseString() {
        Attributes attributes = new Attributes();
        attributes.put("Key1", "Value1");
        assertEquals("value1", attributes.getUserData("Key1"));
        assertNull(attributes.getUserData(""));
    }

}