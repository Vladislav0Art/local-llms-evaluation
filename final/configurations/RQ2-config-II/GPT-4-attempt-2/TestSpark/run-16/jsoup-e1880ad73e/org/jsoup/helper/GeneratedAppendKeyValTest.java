package org.jsoup.helper;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        URL url = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(url);
        Connection.KeyVal kv = mock(Connection.KeyVal.class);
        when(kv.key()).thenReturn("testKey");
        when(kv.value()).thenReturn("testValue");

        builder.appendKeyVal(kv);

        URL expectedURL = new URL("http://example.com?testKey=testValue");
        assertEquals(expectedURL, builder.build());
    }

}