package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException, MalformedURLException {
        URL inputUrl = new URL("https://www.test.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        Connection.KeyVal kvMock = mock(Connection.KeyVal.class);
        when(kvMock.key()).thenReturn("testKey");
        when(kvMock.value()).thenReturn("testValue");

        urlBuilder.appendKeyVal(kvMock);
        URL url = urlBuilder.build();

        assertEquals("https://www.test.com?testKey=testValue", url.toString());
    }

}