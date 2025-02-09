package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedAppendKeyValUnsupportedEncodingTest {

    @Test
    public void appendKeyValUnsupportedEncodingTest() throws UnsupportedEncodingException {
        URL url = new URL("https://www.example.com");
        UrlBuilder builder = new UrlBuilder(url);

        Connection.KeyVal keyVal = mock(Connection.KeyVal.class);
        when(keyVal.key()).thenReturn("key");
        when(keyVal.value()).thenReturn("value\uFFFF");

        builder.appendKeyVal(keyVal);  // cause UnsupportedEncodingException
    }

}