package org.jsoup.helper;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws Exception {
        URL url = new URL("http://test.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal keyValMock = mock(Connection.KeyVal.class);
        when(keyValMock.toString()).thenReturn("testKey=testValue");

        urlBuilder.appendKeyVal(keyValMock);
        URL builtUrl = urlBuilder.build();

        // Check that key-value was added to url
        Assert.assertTrue(builtUrl.toString().contains(keyValMock.toString()));
    }

}