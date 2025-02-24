package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.junit.Assert.assertEquals;

public class GeneratedAppendKeyValWithNullInputTest {

    @Test
    public void appendKeyValWithNullInputTest() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        urlBuilder.appendKeyVal(null);
    }

}