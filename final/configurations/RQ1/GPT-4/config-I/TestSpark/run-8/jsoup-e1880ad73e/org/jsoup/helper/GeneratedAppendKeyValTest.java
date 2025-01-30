package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URISyntaxException;
import java.net.MalformedURLException;

import static org.mockito.Mockito.*;

import org.mockito.Mockito;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        //mocking KeyVal object
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        when(keyVal.key()).thenReturn("key");
        when(keyVal.value()).thenReturn("value");

        urlBuilder.appendKeyVal(keyVal);
        Assert.assertTrue(urlBuilder.u.toString().contains("?key=value"));
    }

}