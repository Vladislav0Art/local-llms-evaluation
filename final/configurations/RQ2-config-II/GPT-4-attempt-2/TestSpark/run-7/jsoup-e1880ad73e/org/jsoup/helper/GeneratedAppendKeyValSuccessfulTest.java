package org.jsoup.helper;

import org.jsoup.Connection;
import org.mockito.Mockito;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedAppendKeyValSuccessfulTest {

    @Test
    public void AppendKeyValSuccessfulTest() throws UnsupportedEncodingException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        when(kv.key()).thenReturn("test");
        when(kv.value()).thenReturn("value");
        urlBuilder.appendKeyVal(kv);
        URL result = urlBuilder.build();
        assertTrue(result.toString().contains("test=value"));
    }

}