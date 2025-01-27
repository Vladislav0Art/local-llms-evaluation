package org.jsoup.helper;

public class GeneratedTestInvalidUrl {

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
    public void testInvalidUrl() throws Exception {
        try {
            new URL("invalid://example.com/path/to/resource");
        } catch (Exception e) {
        }
        String expected = null;
        String actual = UrlBuilder.toString(null);
        assertEquals(expected, actual);
    }
}

public class Main {

    public static void main(String[] args) throws Exception {
        org.junit.runner.JUnitCore.main("TestUrlBuilder");
    }

}