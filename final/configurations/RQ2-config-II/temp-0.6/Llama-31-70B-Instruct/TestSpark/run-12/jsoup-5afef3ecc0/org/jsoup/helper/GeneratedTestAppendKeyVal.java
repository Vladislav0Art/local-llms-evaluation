package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestAppendKeyVal {

    private URL inputUrl;
    private UrlBuilder urlBuilder;

    @Before
    public void setUp() throws MalformedURLException {
        inputUrl = new URL("https://www.example.com");
        urlBuilder = new UrlBuilder(inputUrl);
    }

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        Connection.KeyVal keyVal = new Connection.KeyVal("key", "value");
        urlBuilder.appendKeyVal(keyVal);
        assertEquals("key=value", urlBuilder.q.toString());
    }

}