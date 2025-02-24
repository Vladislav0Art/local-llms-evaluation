package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildUrl_withNormalUrl_returnsExpectedUrl {

    private static final String ENCODED_URL = "http://example.com/path?key=value";

    @Test
    public void buildUrl_withNormalUrl_returnsExpectedUrl() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com/path?key=value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        URL actualUrl = urlBuilder.build();

        assertEquals(ENCODED_URL, actualUrl.toString());
    }

}