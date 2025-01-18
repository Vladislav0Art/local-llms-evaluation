package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

public class GeneratedAppendKeyValUnsupportedEncodingExceptionTest {

    @Test
    public void appendKeyValUnsupportedEncodingExceptionTest() throws UnsupportedEncodingException {
        try {
            URL inputUrl = new URL("https://www.example.com");
            Connection.KeyVal kv = mock(Connection.KeyVal.class);
            when(kv.key()).thenReturn("\uD800");
            when(kv.value()).thenReturn("value");

            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            urlBuilder.appendKeyVal(kv);
        } catch (MalformedURLException mue) {
            fail("MalformedURLException should not have been thrown.");
        }
    }

}