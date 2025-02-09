package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValUnsupportedEncodingExceptionTest {

    @Test
    public void appendKeyValUnsupportedEncodingExceptionTest() throws UnsupportedEncodingException {
        URL testUrl = null;
        try {
            testUrl = new URL("https://www.example.com");
        } catch (MalformedURLException e) {
            // handle exception
        }

        UrlBuilder testBuilder = new UrlBuilder(testUrl);
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(kv.key()).thenReturn("testKey");
        Mockito.when(kv.value()).thenReturn("testValue\\U+1F435"); // illegal sequence for URLEncoder

        testBuilder.appendKeyVal(kv);
    }

}