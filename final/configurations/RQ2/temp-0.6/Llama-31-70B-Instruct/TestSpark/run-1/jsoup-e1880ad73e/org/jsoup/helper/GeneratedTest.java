package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setup() {
        urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void testAppendKeyValWithValidKeyVal() throws UnsupportedEncodingException {
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(keyVal.key()).thenReturn("key");
        Mockito.when(keyVal.value()).thenReturn("value");

        urlBuilder.appendKeyVal(keyVal);

        Assert.assertEquals("key=value", urlBuilder.q.toString());
    }

    @Test
    public void testAppendKeyValWithNullKeyVal() {
        urlBuilder.appendKeyVal(null);

        Assert.assertNull(urlBuilder.q);
    }

    @Test
    public void testAppendKeyValWithNullKey() throws UnsupportedEncodingException {
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(keyVal.key()).thenReturn(null);
        Mockito.when(keyVal.value()).thenReturn("value");

        urlBuilder.appendKeyVal(keyVal);

        Assert.assertNull(urlBuilder.q);
    }

    @Test
    public void testAppendKeyValWithNullValue() throws UnsupportedEncodingException {
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(keyVal.key()).thenReturn("key");
        Mockito.when(keyVal.value()).thenReturn(null);

        urlBuilder.appendKeyVal(keyVal);

        Assert.assertEquals("key=", urlBuilder.q.toString());
    }

}