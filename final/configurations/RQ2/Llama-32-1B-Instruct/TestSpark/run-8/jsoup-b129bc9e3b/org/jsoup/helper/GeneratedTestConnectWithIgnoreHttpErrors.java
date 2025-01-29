package org.jsoup.helper;

public class GeneratedTestConnectWithIgnoreHttpErrors {

    private static final String HTTP_VERSION = "HTTP/1.1";

    @Test
    public void testConnectWithIgnoreHttpErrors() {
        HttpConnection connection = HttpConnection.connect("http://example.com");
        connection.setIgnoreHttpErrors(true);
        Assert.assertFalse(connection.getError().equals(HttpsURLConnection.ERROR_NONE));
    }

}