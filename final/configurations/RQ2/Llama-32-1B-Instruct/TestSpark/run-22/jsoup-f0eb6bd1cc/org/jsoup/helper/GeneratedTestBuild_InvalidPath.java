package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;

public class GeneratedTestBuild_InvalidPath {

    public class UriHelperTest {

        @Test
        public void testBuild_InvalidPath() throws UnsupportedEncodingException {
            UrlBuilder builder = new UrlBuilder("invalid url");
            URI parsedURL = mock(URI.class);
            when(parsedURL.getScheme()).thenReturn("http");
            when(parsedURL.getHost()).thenReturn("example.com");
            when(parsedURL.getPath()).thenThrow(new URISyntaxException("Invalid URL", null));
            assertThrows(URISyntaxException.class, () -> builder.build());
        }
    }

}

class UrlBuilder {
    public String build() throws UnsupportedEncodingException {
        return "https://" + getHost() + getPath();
    }

    private String getHost() {
        try {
            return new URI(getScheme(), getPort(), getPath()).getHost();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    private int getPort() {
        if (!getHost().contains(":")) {
            return 80;
        } else {
            String[] parts = host().split(":");
            if (parts.length == 1 && parts[0].equals("localhost") || !parts[0].startsWith(":")) {
                return 8080;
            }
            return Integer.parseInt(parts[1]);
        }
    }

    private String getPath() {
        try {
            return new URI(getScheme(), getPort(), getPath()).getPath();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public static class Connection {
        public String scheme;
        public String host;
        public int port;

        public Connection(String scheme, String host, int port) {
            this.scheme = scheme;
            this.host = host;
            this.port = port;
        }
    }

}