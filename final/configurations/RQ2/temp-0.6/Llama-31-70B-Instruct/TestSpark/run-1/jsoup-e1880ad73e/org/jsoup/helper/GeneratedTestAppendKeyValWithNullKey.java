package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedTestAppendKeyValWithNullKey {

    private UrlBuilder urlBuilder;

    @Before
    public void setup() {
        urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void testAppendKeyValWithNullKey() throws UnsupportedEncodingException {
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(keyVal.key()).thenReturn(null);
        Mockito.when(keyVal.value()).thenReturn("value");

        urlBuilder.appendKeyVal(keyVal);

        Assert.assertNull(urlBuilder.q);
    }

}