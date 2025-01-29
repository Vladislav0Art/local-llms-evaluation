package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;

public class GeneratedTestToURI_ReturnsCorrectValue {

    public class UriHelperTest {

        @Test
        public void testToURI_ReturnsCorrectValue() throws URISyntaxException {
            UrlBuilder builder = new UrlBuilder("http://example.com/path");
            String expected = "http://example.com/path";
            String actual = builder.build();
            assertEquals(expected, actual);
        }

    }