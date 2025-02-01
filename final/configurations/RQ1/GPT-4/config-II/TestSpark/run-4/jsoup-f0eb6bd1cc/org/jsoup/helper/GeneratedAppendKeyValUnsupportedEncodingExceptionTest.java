package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.Connection;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;
import java.net.UnsupportedEncodingException;

public class GeneratedAppendKeyValUnsupportedEncodingExceptionTest {

    @Test
    public void appendKeyValUnsupportedEncodingExceptionTest() throws UnsupportedEncodingException, MalformedURLException {
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(keyVal.key()).thenThrow(new UnsupportedEncodingException());
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://localhost"));
        urlBuilder.appendKeyVal(keyVal);
    }

}