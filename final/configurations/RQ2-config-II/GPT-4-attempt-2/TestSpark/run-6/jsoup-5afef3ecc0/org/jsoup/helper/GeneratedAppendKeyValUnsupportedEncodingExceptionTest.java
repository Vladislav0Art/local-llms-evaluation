package org.jsoup.helper;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedAppendKeyValUnsupportedEncodingExceptionTest {

    @Test
    public void appendKeyValUnsupportedEncodingExceptionTest() throws UnsupportedEncodingException {
        URL url = new URL("http://test.url");
        UrlBuilder builder = new UrlBuilder(url);
        Connection.KeyVal mockKeyVal = mock(Connection.KeyVal.class);
        when(mockKeyVal.key()).thenReturn("未");
        when(mockKeyVal.value()).thenReturn("支持");
        builder.appendKeyVal(mockKeyVal);
    }

}