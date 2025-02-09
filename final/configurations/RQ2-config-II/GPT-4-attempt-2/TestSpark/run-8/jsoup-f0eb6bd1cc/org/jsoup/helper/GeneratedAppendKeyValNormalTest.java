package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertNotNull;

public class GeneratedAppendKeyValNormalTest {

    @Test
    public void appendKeyValNormalTest() throws UnsupportedEncodingException {
        URL mockUrl = Mockito.mock(URL.class);
        UrlBuilder urlBuilder = new UrlBuilder(mockUrl);
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(keyVal.toString()).thenReturn("key=value");
        urlBuilder.appendKeyVal(keyVal);
    }

}