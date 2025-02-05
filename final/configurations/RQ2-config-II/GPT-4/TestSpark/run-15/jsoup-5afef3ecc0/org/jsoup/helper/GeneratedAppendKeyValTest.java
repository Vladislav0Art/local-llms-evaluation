package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        URL testUrl = new URL("http://www.test.com");
        UrlBuilder builder = new UrlBuilder(testUrl);

        Connection.KeyVal keyValMock = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(keyValMock.key()).thenReturn("testKey");
        Mockito.when(keyValMock.value()).thenReturn("testValue");

        builder.appendKeyVal(keyValMock);
        URL result = builder.build();

        Assert.assertEquals(true, result.toString().contains("testKey=testValue"));
    }

}