package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedUrlBuilderAppendKeyValTest {

    @Test
    public void UrlBuilderAppendKeyValTest() throws UnsupportedEncodingException {
        URL url = new URL("http://sampleUrl.com");
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(keyVal.key()).thenReturn("key");
        Mockito.when(keyVal.value()).thenReturn("value");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(keyVal);
        String result = urlBuilder.toString();
        assertEquals("http://sampleUrl.com?key=value", result);
    }

}