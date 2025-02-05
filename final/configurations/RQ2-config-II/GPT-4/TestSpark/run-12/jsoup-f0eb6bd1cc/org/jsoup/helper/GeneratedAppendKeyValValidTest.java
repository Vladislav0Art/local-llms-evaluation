package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import org.jsoup.Connection;
import org.mockito.Mockito;

public class GeneratedAppendKeyValValidTest {

    @Test
    public void appendKeyValValidTest() throws UnsupportedEncodingException {
        URL url = new URL("https://www.test.com");
        UrlBuilder builder = new UrlBuilder(url);

        Connection.KeyVal kvMock = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(kvMock.key()).thenReturn("key");
        Mockito.when(kvMock.value()).thenReturn("value");

        builder.appendKeyVal(kvMock);
        URL resultUrl = builder.build();
        assertEquals("https://www.test.com?key=value", resultUrl.toString());
    }

}