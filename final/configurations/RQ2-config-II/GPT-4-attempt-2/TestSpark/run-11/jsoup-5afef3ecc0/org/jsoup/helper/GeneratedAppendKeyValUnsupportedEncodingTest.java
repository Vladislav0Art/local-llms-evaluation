package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValUnsupportedEncodingTest {

    @Test
    public void appendKeyValUnsupportedEncodingTest() throws UnsupportedEncodingException {
        URL url = null;
        try {
            url = new URL("http://example.com");
        } catch (MalformedURLException e) {
            fail("Test failed due to MalformedURLException.");
        }
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(kv.key()).thenReturn("unsupported-encoded-key");
        Mockito.when(kv.value()).thenReturn("value");

        urlBuilder.appendKeyVal(kv);
    }

}