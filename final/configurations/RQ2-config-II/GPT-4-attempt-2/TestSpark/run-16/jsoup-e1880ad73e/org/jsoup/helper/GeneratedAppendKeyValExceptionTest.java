package org.jsoup.helper;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValExceptionTest {

    @Test
    public void appendKeyValExceptionTest() throws UnsupportedEncodingException {
        URL url = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(url);
        Connection.KeyVal kv = mock(Connection.KeyVal.class);
        when(kv.key()).thenReturn("testKey");
        when(kv.value()).thenReturn("тест"); //non-English characters that should throw UnsupportedEncodingException

        builder.appendKeyVal(kv);
    }

}