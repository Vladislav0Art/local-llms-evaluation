package org.jsoup.helper;

public class GeneratedTestSslSocketFactory {

    @Test
    public void testSslSocketFactory() {
        TestHttpConnection connection = new TestHttpConnection();
        assertEquals("https://example.com", connection.sslSocketFactory("test", 443));
    }

}