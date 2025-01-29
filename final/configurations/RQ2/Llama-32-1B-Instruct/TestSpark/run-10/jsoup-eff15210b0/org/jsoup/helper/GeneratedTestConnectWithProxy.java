package org.jsoup.helper;

public class GeneratedTestConnectWithProxy {

    @Test
    public void testConnectWithProxy() {
        HttpsURLConnection connection = (HttpsURLConnection) org.jsoup.helper.HttpConnection.connect("https://example.com");
        assertEquals("https://example.com", connection.getURL());
    }

}