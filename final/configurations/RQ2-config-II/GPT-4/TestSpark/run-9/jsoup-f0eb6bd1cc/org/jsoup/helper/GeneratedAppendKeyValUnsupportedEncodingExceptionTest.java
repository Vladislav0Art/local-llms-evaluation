package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValUnsupportedEncodingExceptionTest {

    @Test
    public void appendKeyValUnsupportedEncodingExceptionTest() throws UnsupportedEncodingException {
        URL url = new URL("https://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        Connection.KeyVal mockKeyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(mockKeyVal.key()).thenReturn("unsupported+key");
        Mockito.when(mockKeyVal.value()).thenReturn("unsupported+value");

        urlBuilder.appendKeyVal(mockKeyVal);
    }

}