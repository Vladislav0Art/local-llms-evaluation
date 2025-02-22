package org.jsoup.helper;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.UrlBuilder;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestAppendKeyVal {

    private UrlBuilder builder;
    private URL inputUrl;

    @Before
    public void setUp() throws Exception {
        inputUrl = new URL("https://www.example.com");
        builder = new UrlBuilder(inputUrl);
    }

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        Connection.KeyVal kv = mock(Connection.KeyVal.class);
        when(kv.key()).thenReturn("testKey");
        when(kv.value()).thenReturn("testValue");
        builder.appendKeyVal(kv);
        assertNotNull(builder.q);
        assertEquals("testKey=testValue", builder.q.toString());
    }

}