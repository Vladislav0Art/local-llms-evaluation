package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;

public class GeneratedTestFromURL_ReturnsCorrectValue {

    public class UriHelperTest {

        @Test
        public void testFromURL_ReturnsCorrectValue() throws MalformedURLException {
            URI url = new URI("http://example.com/path?query=value");
            UrlBuilder builder = new UrlBuilder(url);
            String expected = "http://example.com/path?query=value";
            String actual = builder.build();
            assertEquals(expected, actual);
        }
    }

}