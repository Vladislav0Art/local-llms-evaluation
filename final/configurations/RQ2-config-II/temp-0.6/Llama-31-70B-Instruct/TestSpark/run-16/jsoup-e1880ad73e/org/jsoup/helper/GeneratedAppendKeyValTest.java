package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(keyVal.getKey()).thenReturn("key");
        Mockito.when(keyVal.getValue()).thenReturn("value");

        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://www.example.com/"));
        urlBuilder.appendKeyVal(keyVal);

        assertEquals("key", urlBuilder.keyVals.get(0).getKey());
        assertEquals("value", urlBuilder.keyVals.get(0).getValue());
    }

}