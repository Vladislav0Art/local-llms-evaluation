package org.jsoup.helper;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;

public class GeneratedTestBuild_ReturnsCorrectUrl {

    public static class UriHelperTest {
        public void testToURI_ReturnsCorrectValue() throws URISyntaxException {
            String expected = "http://example.com/path";
            String actual = new UrlBuilder("http://example.com/path").build();
            assertEquals(expected, actual);
        }

        public void testFromURL_ReturnsCorrectValue() throws MalformedURLException {
            String url = "https://example.com/path?query=value";
            String actual = new UrlBuilder(url).build();
            assertEquals("https://example.com/path", actual);
        }
    }

    public static class UriParserTest {
        private static final String[] EXPECTED_URLS = {"https://example.com/path", "http://example.com/path"};

        @Test
        public void testBuild_ReturnsCorrectUrl() throws UnsupportedEncodingException {
            UrlBuilder builder = new UrlBuilder("http://example.com/path");
            for (String url : EXPECTED_URLS) {
                String actual = builder.build();
                assertEquals(url, actual);
            }
        }

        public static void main(String[] args) {
            UriHelperTest test = new UriHelperTest();

            test.testToURI_ReturnsCorrectValue();

            test.testFromURL_ReturnsCorrectValue();

            for (String url : EXPECTED_URLS) {
                test.testBuild_InvalidPath(url);
            }
        }

    }