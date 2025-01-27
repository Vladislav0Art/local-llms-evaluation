package org.jsoup.helper;

public class GeneratedTestBasicUrl {

    private static final String SCHEME = "https";
    private static final int PORT = 443;

    public static String toString(URL url) {
        return SCHEME + "://" + (url.getHost() != null ? url.getHost() : "") + ":" + url.getPort();
    }

    public static String toString(String scheme, String host, int port) {
        return scheme + "://" + host + ":" + port;
    }
}

public class TestUrlBuilder {

    @Test
    public void testBasicUrl() throws Exception {
        URL url = new URL("https://example.com");
        String expected = "https://example.com";
        String actual = UrlBuilder.toString(url);
        assertEquals(expected, actual);
    }

}