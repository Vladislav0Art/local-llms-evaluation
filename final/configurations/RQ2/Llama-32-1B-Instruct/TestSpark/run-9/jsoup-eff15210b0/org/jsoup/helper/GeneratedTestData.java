package org.jsoup.helper;

public class GeneratedTestData {

    @Test
    public void testData() {
        TestHttpConnection connection = new TestHttpConnection();
        assertEquals("https://example.com", connection.data("key", "value"));
    }

}