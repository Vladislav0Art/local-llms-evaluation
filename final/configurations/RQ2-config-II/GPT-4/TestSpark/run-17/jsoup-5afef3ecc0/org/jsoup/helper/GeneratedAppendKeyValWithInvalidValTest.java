package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValWithInvalidValTest {

    @Test
    public void appendKeyValWithInvalidValTest() throws UnsupportedEncodingException, MalformedURLException {
        URL testUrl = new URL("https://www.google.com/");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(kv.key()).thenReturn("testKey");
        Mockito.when(kv.value()).thenReturn("");

        urlBuilder.appendKeyVal(kv);
    }

}