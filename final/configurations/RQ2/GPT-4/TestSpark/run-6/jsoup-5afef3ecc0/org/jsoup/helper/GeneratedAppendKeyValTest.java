package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.UnsupportedEncodingException;

import static org.mockito.Mockito.*;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal keyVal = mock(Connection.KeyVal.class);
        when(keyVal.toString()).thenReturn("key=val");
        urlBuilder.appendKeyVal(keyVal);
        URL resultUrl = urlBuilder.build();
        Assert.assertTrue(resultUrl.toString().contains(keyVal.toString()));
    }

}