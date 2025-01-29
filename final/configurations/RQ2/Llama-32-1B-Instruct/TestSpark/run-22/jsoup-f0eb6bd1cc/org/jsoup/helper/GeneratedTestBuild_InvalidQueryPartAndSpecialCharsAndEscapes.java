package org.jsoup.helper;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;

public class GeneratedTestBuild_InvalidQueryPartAndSpecialCharsAndEscapes {

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
        public void testBuild_InvalidQueryPartAndSpecialCharsAndEscapes() throws UnsupportedEncodingException {
            String expected = "https://example.com/path";
            try {
                new UrlBuilder("http://example.com/path/path?query=value").build();
                throw new RuntimeException();
            } catch (UnsupportedEncodingException e) {
                assertThrows(UnsupportedEncodingException.class, () -> e);
            }
        }

    }