package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedTestAppendKeyValWithNullValue {

    private UrlBuilder urlBuilder;

    @Before
    public void setup() {
        urlBuilder = new UrlBuilder(null);
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