package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValWithUnsupportedEncodingExceptionTest {

    @Test
    public void appendKeyValWithUnsupportedEncodingExceptionTest() throws MalformedURLException, UnsupportedEncodingException {
        URL testURL = new URL("http://testurl.com");
        UrlBuilder urlBuilder = new UrlBuilder(testURL);
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);

        Mockito.when(kv.key()).thenReturn("testKey");
        Mockito.when(kv.value()).thenThrow(new UnsupportedEncodingException());

        urlBuilder.appendKeyVal(kv);
    }

}