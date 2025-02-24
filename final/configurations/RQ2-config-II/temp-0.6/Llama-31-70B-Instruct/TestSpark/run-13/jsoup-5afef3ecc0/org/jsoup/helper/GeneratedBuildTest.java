package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedBuildTest {

    private static final String TEST_URL = "http://example.com/";

    @Test
    public void buildTest() throws URISyntaxException, MalformedURLException {
        URL inputUrl = new URL(TEST_URL);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL builtUrl = urlBuilder.build();

        assertEquals(builtUrl, inputUrl);
    }

}