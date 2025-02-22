package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public class GeneratedAppendKeyVal {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() throws Exception {
        URL url = new URL("http://www.example.com/");
        urlBuilder = new UrlBuilder(url);
    }

    @Test
    public void appendKeyVal() throws UnsupportedEncodingException {
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(keyVal.key()).thenReturn("test");
        Mockito.when(keyVal.value()).thenReturn("value");

        urlBuilder.appendKeyVal(keyVal);

        Assert.assertEquals("test=value", urlBuilder.q.toString());
    }

}