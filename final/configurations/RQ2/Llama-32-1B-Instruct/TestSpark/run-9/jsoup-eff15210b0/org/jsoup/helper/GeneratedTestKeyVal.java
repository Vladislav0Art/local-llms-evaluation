package org.jsoup.helper;

public class GeneratedTestKeyVal {

    @Test
    public void testKeyVal() {
        TestHttpConnection connection = new TestHttpConnection();
        assertEquals("https://example.com", connection.data(new String[]{"key1", "value1"}));
    }

}