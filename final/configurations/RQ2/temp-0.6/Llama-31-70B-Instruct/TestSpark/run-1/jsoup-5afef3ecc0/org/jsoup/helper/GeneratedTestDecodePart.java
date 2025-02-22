package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedTestDecodePart {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        URL url = null;
        try {
            url = new URL("https://www.example.com/test");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        urlBuilder = new UrlBuilder(url);
    }

    @Test
    public void testDecodePart() {
        String encodedPart = "encoded part";
        String decodedPart = UrlBuilder.decodePart(encodedPart);
        assertEquals(encodedPart, decodedPart);
    }

}