package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedTestAppendKeyValWithValidKeyVal {

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

}