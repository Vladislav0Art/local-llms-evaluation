package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
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

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedAppendKeyValTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setup() throws MalformedURLException {
        URL url = new URL("http://example.com");
        urlBuilder = new UrlBuilder(url);
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        when(keyVal.key()).thenReturn("key");
        when(keyVal.value()).thenReturn("value");

        urlBuilder.appendKeyVal(keyVal);

        assertTrue(urlBuilder.q.toString().contains("key=value"));
    }

}