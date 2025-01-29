package org.jsoup.helper;

public class GeneratedTestConnectUrlString {

    @Test
    public void testConnectUrlString() {
        TestHttpConnection connection = new TestHttpConnection();
        String url = "https://example.com";
        Connection conn = connection.url(url);
        assertEquals(conn, connection.url("https://example.com"));
    }

}