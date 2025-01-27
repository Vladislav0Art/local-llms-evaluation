package org.jsoup.helper;

public class GeneratedTestRelativeUrl {

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
    public void testRelativeUrl() throws Exception {
        URL url = new URL("/path/to/resource");
        String expected = "https://example.com/path/to/resource";
        String actual = UrlBuilder.toString(url);
        assertEquals(expected, actual);
    }

}