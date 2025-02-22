package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

public class GeneratedTest {

    @Test
    public void testBuild() throws Exception {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL expectedUrl = new URL("http://example.com");

        URL actualUrl = urlBuilder.build();

        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @Test
    public void testAppendKeyVal() throws Exception {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(keyVal.key()).thenReturn("foo");
        Mockito.when(keyVal.value()).thenReturn("bar");

        urlBuilder.appendKeyVal(keyVal);

        Assert.assertEquals("foo=bar", urlBuilder.q.toString());
    }

    @Test
    public void testAppendKeyValNoValue() throws Exception {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(keyVal.key()).thenReturn("foo");
        Mockito.when(keyVal.value()).thenReturn(null);

        urlBuilder.appendKeyVal(keyVal);

        Assert.assertEquals("foo", urlBuilder.q.toString());
    }

}