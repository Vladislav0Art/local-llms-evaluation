package org.jsoup.helper;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedAppendKeyValUnsupportedEncodingExceptionTest {

    @Test
    public void appendKeyValUnsupportedEncodingExceptionTest() throws Exception {
        URL url = new URL("http://test.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal keyValMock = mock(Connection.KeyVal.class);
        when(keyValMock.toString()).thenReturn("testKey=unsupportedEncodingValue");

        urlBuilder.appendKeyVal(keyValMock);
    }

}