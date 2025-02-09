package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.*;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.mockito.Mockito.mock;
import static org.junit.Assert.*;

public class GeneratedAppendKeyValUnsupportedEncodingTest {

    @Test
    public void appendKeyValUnsupportedEncodingTest() throws MalformedURLException, UnsupportedEncodingException {
        URL testUrl = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        Connection.KeyVal mockKeyVal = mock(Connection.KeyVal.class);
        Mockito.when(mockKeyVal.key()).thenReturn("unsupported_encoding_key");
        urlBuilder.appendKeyVal(mockKeyVal);
    }

}