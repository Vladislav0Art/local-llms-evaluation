package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.jsoup.Connection.KeyVal;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws Exception {
        KeyVal kv = mock(KeyVal.class);
        when(kv.key()).thenReturn("q");
        when(kv.value()).thenReturn("search term");

        URL url = new URL("http://www.google.com/search");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(kv);
        URL result = urlBuilder.build();
        assertEquals("http://www.google.com/search?q=search+term", result.toString());
    }

}