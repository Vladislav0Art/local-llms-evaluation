package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

public class GeneratedTestAppendKeyVal {

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

}