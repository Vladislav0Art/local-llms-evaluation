package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection.KeyVal;

import java.net.URL;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.net.URLDecoder;
import java.io.UnsupportedEncodingException;

import org.junit.Before;
import org.junit.After;

public class GeneratedAppendKeyValTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setup() {
        URL url;
        try {
            url = new URL("http://example.com/test?q=test");
            urlBuilder = new UrlBuilder(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @After
    public void teardown() {
        urlBuilder = null;
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        KeyVal kv = new KeyVal("key", "value", false);
        urlBuilder.appendKeyVal(kv);
        assertEquals("key=value", urlBuilder.q.toString());
    }

}