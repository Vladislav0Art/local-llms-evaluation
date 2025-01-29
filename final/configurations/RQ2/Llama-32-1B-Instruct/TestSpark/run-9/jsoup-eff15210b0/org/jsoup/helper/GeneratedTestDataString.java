package org.jsoup.helper;

public class GeneratedTestDataString {

    @Test
    public void testDataString() {
        TestHttpConnection connection = new TestHttpConnection();
        assertEquals("https://example.com", connection.data(new String[]{"key", "value"}));
    }

}