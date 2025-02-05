package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;
import java.net.URI;
import java.net.IDN;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValNormalInputTest {

    @Test
    public void appendKeyValNormalInputTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(keyVal.key()).thenReturn("testKey");
        Mockito.when(keyVal.value()).thenReturn("testValue");

        urlBuilder.appendKeyVal(keyVal);
        URL builtUrl = urlBuilder.build();

        assertTrue(builtUrl.toString().contains("testKey=testValue"));
    }

}