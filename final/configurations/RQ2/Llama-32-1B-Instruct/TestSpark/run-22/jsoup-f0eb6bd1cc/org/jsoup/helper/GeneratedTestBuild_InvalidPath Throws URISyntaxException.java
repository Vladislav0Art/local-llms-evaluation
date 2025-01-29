package org.jsoup.helper;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;

public class GeneratedTestBuild_InvalidPath Throws URISyntaxException {

    public static class UriHelperTest {
        public void testToURI_ReturnsCorrectValue() throws URISyntaxException {
            UrlBuilder builder = new UrlBuilder("http://example.com/path");
            String expected = "http://example.com/path";
            String actual = builder.build();
            assertEquals(expected, actual);
        }

        public void testFromURL_ReturnsCorrectValue() throws MalformedURLException {
            URI url = new URI("http://example.com/path?query=value");
            UrlBuilder builder = new UrlBuilder(url);
            String expected = "http://example.com/path?query=value";
            String actual = builder.build();
            assertEquals(expected, actual);
        }
    }

    public static class UriParserTest {
        private static final String[] EXPECTED_URLS = {"https://example.com/path", "http://example.com/path"};

        @Test
        public void testBuild_InvalidPath

        Throws URISyntaxException() {
            try {
                UrlBuilder builder = new UrlBuilder("invalid url");
                assertThrows(URISyntaxException.class, () -> builder.build());
            } catch (URISyntaxException e) {
                // expected exception
            }
        }
    }
}

class UrlBuilder {
    private String scheme;
    private String host;
    private int port;

    public String build() throws UnsupportedEncodingException {
        return "https://" + getHost() + port == 80 ? "" : getPort() + ":/" + getPath();
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public String getPath() {
        try {
            if (!getHost().contains(":")) {
                return "";
            } else {
                return host().split(":")[0];
            }
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

}