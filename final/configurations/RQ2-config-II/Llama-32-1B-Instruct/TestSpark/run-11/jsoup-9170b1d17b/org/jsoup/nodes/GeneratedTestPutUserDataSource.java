package org.jsoup.nodes;

public class GeneratedTestPutUserDataSource {

    @Test
    public void testPutUserDataSource() {
        Attributes attributes = new Attributes();
        assertEquals(null, attributes.putUserData("key", "value"));
        assertEquals("value", attributes.putUserData("keyElseValue", "value"));
    }

}