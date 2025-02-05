package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedAppendKeyValWithUnsupportedEncodingKeyValTest {

    @Test
    public void appendKeyValWithUnsupportedEncodingKeyValTest() throws Exception {
        URL testUrl = new URL("http://test.com");
        UrlBuilder builder = new UrlBuilder(testUrl);

        Connection.KeyVal testKeyVal = mock(Connection.KeyVal.class);
        when(testKeyVal.key()).thenReturn("testKey");
        when(testKeyVal.value()).thenReturn("\ud800");  // invalid utf8

        builder.appendKeyVal(testKeyVal);
    }

}