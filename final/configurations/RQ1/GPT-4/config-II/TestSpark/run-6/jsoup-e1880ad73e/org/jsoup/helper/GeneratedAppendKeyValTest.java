package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.StringUtil;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("https://www.google.com/search");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = mock(Connection.KeyVal.class);
        when(kv.key()).thenReturn("k");
        when(kv.value()).thenReturn("v");
        urlBuilder.appendKeyVal(kv);
        URL expectedUrl = new URL("https://www.google.com/search?q=k%3Dv");
        Assert.assertEquals(urlBuilder.build(), expectedUrl);
    }

}