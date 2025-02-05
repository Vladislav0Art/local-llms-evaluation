package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValExceptionTest {

    @Test
    public void appendKeyValExceptionTest() throws MalformedURLException, UnsupportedEncodingException {
        String url = "https://www.google.com";
        UrlBuilder urlBuilder = new UrlBuilder(new URL(url));

        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(kv.key()).thenReturn("\uD800");
        Mockito.when(kv.value()).thenReturn("value");

        urlBuilder.appendKeyVal(kv);
    }

}