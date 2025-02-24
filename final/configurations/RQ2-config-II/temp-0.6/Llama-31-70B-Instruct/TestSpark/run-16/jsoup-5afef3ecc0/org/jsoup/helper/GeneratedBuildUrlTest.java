package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class GeneratedBuildUrlTest {

    private static final String VALID_URL_STRING = "https://www.example.com";
    private static final String INVALID_URL_STRING = "invalid URL";
    private static final String VALID_KEY = "key";
    private static final String VALID_VALUE = "value";
    private static final String INVALID_KEY = "";
    private static final String INVALID_VALUE = "";
    private static final String VALID_ENCODED_STRING = "a%20b";
    private static final String VALID_DECODED_STRING = "a b";

    @Test
    public void buildUrlTest() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL(VALID_URL_STRING);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL builtUrl = urlBuilder.build();
        Assert.assertEquals(inputUrl, builtUrl);
    }

}