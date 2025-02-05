package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() {
        try {
            URL inputUrl = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            Connection.KeyVal kv = mock(Connection.KeyVal.class);

            when(kv.key()).thenReturn("key");
            when(kv.value()).thenReturn("value");

            urlBuilder.appendKeyVal(kv);

            assertTrue(urlBuilder.build().getQuery().contains("key=value"));
        } catch (Exception e) {
            fail("Exception is not expected here");
        }
    }

}