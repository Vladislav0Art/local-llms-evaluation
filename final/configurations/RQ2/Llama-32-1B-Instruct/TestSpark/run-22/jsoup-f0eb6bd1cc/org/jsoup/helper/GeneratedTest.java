package org.jsoup.helper;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;

public class GeneratedTest {

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

        @Test
        public void testBuild_InvalidPath_ReturnsURISyntaxException() throws UnsupportedEncodingException {
            String expected = "https://example.com/path";
            try {
                new UrlBuilder(expected).build();
                throw new RuntimeException();
            } catch (UnsupportedEncodingException e) {
                assertThrows(UnsupportedEncodingException.class, () -> e);
            }
        }

        @Test
        public void testBuild_InvalidHost() throws UnsupportedEncodingException {
            String expected = "https://example.com/path?query=value";
            try {
                new UrlBuilder("http://localhost").build();
                throw new RuntimeException();
            } catch (UnsupportedEncodingException e) {
                assertThrows(UnsupportedEncodingException.class, () -> e);
            }
        }

        @Test
        public void testBuild_InvalidPort() throws UnsupportedEncodingException {
            String expected = "https://example.com/path?query=value";
            try {
                new UrlBuilder("http://example.com/path:80").build();
                throw new RuntimeException();
            } catch (UnsupportedEncodingException e) {
                assertThrows(UnsupportedEncodingException.class, () -> e);
            }
        }

        @Test
        public void testBuild_InvalidPathPart() throws UnsupportedEncodingException {
            String expected = "https://example.com/path";
            try {
                new UrlBuilder("http://example.com/path/" + "path").build();
                throw new RuntimeException();
            } catch (UnsupportedEncodingException e) {
                assertThrows(UnsupportedEncodingException.class, () -> e);
            }
        }

        @Test
        public void testBuild_InvalidPortPart() throws UnsupportedEncodingException {
            String expected = "https://example.com/path";
            try {
                new UrlBuilder("http://example.com/path:80/path").build();
                throw new RuntimeException();
            } catch (UnsupportedEncodingException e) {
                assertThrows(UnsupportedEncodingException.class, () -> e);
            }
        }

        @Test
        public void testBuild_InvalidPortPartAndPath() throws UnsupportedEncodingException {
            String expected = "https://example.com/path";
            try {
                new UrlBuilder("http://example.com/path:80/path");
                throw new RuntimeException();
            } catch (UnsupportedEncodingException e) {
                assertThrows(UnsupportedEncodingException.class, () -> e);
            }
        }

        @Test
        public void testBuild_InvalidPortAndPath() throws UnsupportedEncodingException {
            String expected = "https://example.com/path";
            try {
                new UrlBuilder("http://example.com/path:80/path?query=value");
                throw new RuntimeException();
            } catch (UnsupportedEncodingException e) {
                assertThrows(UnsupportedEncodingException.class, () -> e);
            }
        }

        @Test
        public void testBuild_InvalidPortPartAndPath() throws UnsupportedEncodingException {
            String expected = "https://example.com/path";
            try {
                new UrlBuilder("http://example.com/path/path?query=value");
                throw new RuntimeException();
            } catch (UnsupportedEncodingException e) {
                assertThrows(UnsupportedEncodingException.class, () -> e);
            }
        }

        @Test
        public void testBuild_InvalidPortPartAndPathAndQuery() throws UnsupportedEncodingException {
            String expected = "https://example.com/path";
            try {
                new UrlBuilder("http://example.com/path/path?query=value");
                throw new RuntimeException();
            } catch (UnsupportedEncodingException e) {
                assertThrows(UnsupportedEncodingException.class, () -> e);
            }
        }

        @Test
        public void testBuild_InvalidPortPartAndPathAndQueryAndSeparator() throws UnsupportedEncodingException {
            String expected = "https://example.com/path";
            try {
                new UrlBuilder("http://example.com/path/path?query=value");
                throw new RuntimeException();
            } catch (UnsupportedEncodingException e) {
                assertThrows(UnsupportedEncodingException.class, () -> e);
            }
        }

        @Test
        public void testBuild_InvalidPortPartAndPathAndQueryAndSeparatorWithEscapes() throws UnsupportedEncodingException {
            String expected = "https://example.com/path";
            try {
                new UrlBuilder("http://example.com/path/path?query=value");
                throw new RuntimeException();
            } catch (UnsupportedEncodingException e) {
                assertThrows(UnsupportedEncodingException.class, () -> e);
            }
        }

        @Test
        public void testBuild_InvalidPortPartAndPathAndQueryAndSeparatorWithSpecialChars() throws UnsupportedEncodingException {
            String expected = "https://example.com/path";
            try {
                new UrlBuilder("http://example.com/path/path?query=value");
                throw new RuntimeException();
            } catch (UnsupportedEncodingException e) {
                assertThrows(UnsupportedEncodingException.class, () -> e);
            }
        }

        @Test
        public void testBuild_InvalidPortPartAndPathAndQueryAndSeparatorWithSpecialCharsAndEscapes() throws UnsupportedEncodingException {
            String expected = "https://example.com/path";
            try {
                new UrlBuilder("http://example.com/path/path?query=value");
                throw new RuntimeException();
            } catch (UnsupportedEncodingException e) {
                assertThrows(UnsupportedEncodingException.class, () -> e);
            }
        }

        @Test
        public void testBuild_InvalidQuery() throws UnsupportedEncodingException {
            String expected = "https://example.com/path";
            try {
                new UrlBuilder("http://example.com/path/path?query=value").build();
                throw new RuntimeException();
            } catch (UnsupportedEncodingException e) {
                assertThrows(UnsupportedEncodingException.class, () -> e);
            }
        }

        @Test
        public void testBuild_InvalidQueryPart() throws UnsupportedEncodingException {
            String expected = "https://example.com/path";
            try {
                new UrlBuilder("http://example.com/path/path?query=value").build();
                throw new RuntimeException();
            } catch (UnsupportedEncodingException e) {
                assertThrows(UnsupportedEncodingException.class, () -> e);
            }
        }

        @Test
        public void testBuild_InvalidQueryPartAndEscapes() throws UnsupportedEncodingException {
            String expected = "https://example.com/path";
            try {
                new UrlBuilder("http://example.com/path/path?query=value").build();
                throw new RuntimeException();
            } catch (UnsupportedEncodingException e) {
                assertThrows(UnsupportedEncodingException.class, () -> e);
            }
        }

        @Test
        public void testBuild_InvalidQueryPartAndSpecialChars() throws UnsupportedEncodingException {
            String expected = "https://example.com/path";
            try {
                new UrlBuilder("http://example.com/path/path?query=value").build();
                throw new RuntimeException();
            } catch (UnsupportedEncodingException e) {
                assertThrows(UnsupportedEncodingException.class, () -> e);
            }
        }

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

        @Test
        public void testBuild_InvalidQueryPartAndEscapesWithDash() throws UnsupportedEncodingException {
            String expected = "https://example.com/path";
            try {
                new UrlBuilder("http://example.com/path/path?query=value").build();
                throw new RuntimeException();
            } catch (UnsupportedEncodingException e) {
                assertThrows(UnsupportedEncodingException.class, () -> e);
            }
        }

        @Test
        public void testBuild_InvalidQueryPartAndSpecialCharsWithDash() throws UnsupportedEncodingException {
            String expected = "https://example.com/path";
            try {
                new UrlBuilder("http://example.com/path/path?query=value").build();
                throw new RuntimeException();
            } catch (UnsupportedEncodingException e) {
                assertThrows(UnsupportedEncodingException.class, () -> e);
            }
        }

        @Test
        public void testBuild_InvalidQueryPartAndEscapesWithDash() throws UnsupportedEncodingException {
            String expected = "https://example.com/path";
            try {
                new UrlBuilder("http://example.com/path/path?query=value").build();
                throw new RuntimeException();
            } catch (UnsupportedEncodingException e) {
                assertThrows(UnsupportedEncodingException.class, () -> e);
            }
        }
    }

}