package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal keyVal = mock(Connection.KeyVal.class);
        when(keyVal.key()).thenReturn("key");
        when(keyVal.value()).thenReturn("value");
        urlBuilder.appendKeyVal(keyVal);
        assertEquals("key=value", urlBuilder.q.toString());
    }

}