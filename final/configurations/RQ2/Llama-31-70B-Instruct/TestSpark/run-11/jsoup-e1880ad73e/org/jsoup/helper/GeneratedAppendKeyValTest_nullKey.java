package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValTest_nullKey {

    @Test
    public void appendKeyValTest_nullKey() throws UnsupportedEncodingException {
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(kv.key()).thenReturn(null);
        Mockito.when(kv.value()).thenReturn("value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.example.com"));
        urlBuilder.appendKeyVal(kv);
        assertEquals("", urlBuilder.query());
    }

}