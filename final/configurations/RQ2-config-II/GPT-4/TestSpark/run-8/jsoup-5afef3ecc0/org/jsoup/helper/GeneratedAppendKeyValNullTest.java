package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValNullTest {

    @Test
    public void appendKeyValNullTest() throws MalformedURLException, UnsupportedEncodingException {
        URL testUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        Connection.KeyVal testKv = null;
        urlBuilder.appendKeyVal(testKv);
    }

}