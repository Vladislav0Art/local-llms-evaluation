package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValConnectionKeyValTest {

    @Test
    public void appendKeyValConnectionKeyValTest() throws UnsupportedEncodingException, MalformedURLException {
        URL testURL = new URL("http://www.test.com");
        UrlBuilder urlBuilder = new UrlBuilder(testURL);
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);

        Mockito.when(kv.key()).thenReturn("testKey");
        Mockito.when(kv.value()).thenReturn("testValue");

        urlBuilder.appendKeyVal(kv);
    }

}