package org.jsoup.helper;

public class GeneratedTestConnectURL {

    @Test
    public void testConnectURL() {
        TestHttpConnection connection = new TestHttpConnection();
        URL url = "https://example.com";
        Connection conn = connection.connect(url);
        assertEquals(conn, connection.url(url));
    }

}