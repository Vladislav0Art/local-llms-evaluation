package org.jsoup.helper;

public class GeneratedTestConnectWithPostDataCharset {

    private static final String URL = "http://example.com";
    private static final String COOKIE_NAME = "cookie";

    @Test
    public void testConnectWithPostDataCharset() throws IOException {
        HttpConnection connection = new HttpConnection();
        String charset = "utf-8";
        connection.postDataCharset(charset);
        assertEquals("http://example.com", connection.post().toString());
    }

}