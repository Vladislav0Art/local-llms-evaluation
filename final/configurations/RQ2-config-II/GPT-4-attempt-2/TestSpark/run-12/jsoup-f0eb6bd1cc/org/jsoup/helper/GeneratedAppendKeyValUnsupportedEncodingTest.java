package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.helper.UrlBuilder;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedAppendKeyValUnsupportedEncodingTest {

    @Test
    public void appendKeyValUnsupportedEncodingTest() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(kv.key()).thenReturn("\uD83D\uDE00");
        Mockito.when(kv.value()).thenReturn("value");
        urlBuilder.appendKeyVal(kv);
    }

}