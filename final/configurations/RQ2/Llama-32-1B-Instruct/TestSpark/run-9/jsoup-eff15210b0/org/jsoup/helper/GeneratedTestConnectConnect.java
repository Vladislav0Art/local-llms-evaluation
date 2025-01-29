package org.jsoup.helper;

public class GeneratedTestConnectConnect {

    @Test
    public void testConnectConnect() {
        TestHttpConnection connection = new TestHttpConnection();
        assertEquals("https://example.com", connection.connect("https://example.com"));
    }

}