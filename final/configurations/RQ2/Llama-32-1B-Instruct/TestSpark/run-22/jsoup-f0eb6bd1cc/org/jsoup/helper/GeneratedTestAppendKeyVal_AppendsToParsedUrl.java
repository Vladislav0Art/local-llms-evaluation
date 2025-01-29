package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.Arrays;

public class GeneratedTestAppendKeyVal_AppendsToParsedUrl {

    public class UriTest {
        private final String inputUrl = "http://example.com/path?query=value";
        private final URL inputURL = new URI("http://example.com/path", null, null);

        @Test
        public void testAppendKeyVal_AppendsToParsedUrl() throws UnsupportedEncodingException {
            Uri parsedURL = new URI(url);
            UrlBuilder builder = new UrlBuilder(parsedURL);
            builder.appendKeyVal(keyVal, "value");
            String expected = "http://example.com/path?query=value&key1=value1&key2=value2";
            String actual = parsedURL.toString();
            assertEquals(expected, actual);
        }
    }

}