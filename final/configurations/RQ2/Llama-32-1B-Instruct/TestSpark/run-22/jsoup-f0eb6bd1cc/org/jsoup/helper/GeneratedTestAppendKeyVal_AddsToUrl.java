package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.Arrays;

public class GeneratedTestAppendKeyVal_AddsToUrl {

    public class UriTest {
        private final String inputUrl = "http://example.com/path?query=value";
        private final URL inputURL = new URI("http://example.com/path", null, null);

        @Test
        public void testAppendKeyVal_AddsToUrl() throws UnsupportedEncodingException {
            UriTest input = new UriTest();
            UrlBuilder builder = new UrlBuilder(inputURL);
            builder.appendKeyVal("key1", "value1");
            String expected = "http://example.com/path?query=value1&key2=value2";
            String actual = inputURL.toString().concat(builder.build());
            assertEquals(expected, actual);
        }

    }