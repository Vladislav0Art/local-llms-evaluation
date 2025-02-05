package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);

        Mockito.when(kv.key()).thenReturn("key");
        Mockito.when(kv.value()).thenReturn("value");

        String url = "https://www.google.com";
        UrlBuilder urlBuilder = new UrlBuilder(new URL(url));
        urlBuilder.appendKeyVal(kv);

        URL builtUrl = urlBuilder.build();
        assertTrue(builtUrl.toString().contains("key"));
        assertTrue(builtUrl.toString().contains("value"));
    }

}