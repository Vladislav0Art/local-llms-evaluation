package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.mockito.Mockito.*;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL urlMock = mock(URL.class);
        Connection.KeyVal kvMock = mock(Connection.KeyVal.class);
        when(kvMock.key()).thenReturn("key");
        when(kvMock.value()).thenReturn("value");

        UrlBuilder urlBuilder = new UrlBuilder(urlMock);
        urlBuilder.appendKeyVal(kvMock);

        URL resultUrl = urlBuilder.build();
        Assert.assertTrue(resultUrl.getQuery().contains("key=value"));
    }

}