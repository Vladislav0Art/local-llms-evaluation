package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedAppendKeyValThrowsExceptionTest {

    @Test
    public void appendKeyValThrowsExceptionTest() throws Exception {
        Connection.KeyVal kv = mock(Connection.KeyVal.class);
        when(kv.key()).thenReturn("?invalid-key");
        when(kv.value()).thenReturn("?invalid-value");

        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(kv); // This should thrown an exception
    }

}