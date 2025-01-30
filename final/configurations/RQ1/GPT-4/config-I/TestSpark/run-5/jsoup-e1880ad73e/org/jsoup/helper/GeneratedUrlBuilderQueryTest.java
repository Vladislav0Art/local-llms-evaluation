package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.mockito.Mockito.*;

public class GeneratedUrlBuilderQueryTest {

    @Test
    public void UrlBuilderQueryTest() throws MalformedURLException {
        URL urlMock = mock(URL.class);
        when(urlMock.getQuery()).thenReturn("query");

        UrlBuilder urlBuilder = new UrlBuilder(urlMock);
        Assert.assertNotNull(urlBuilder.q);
    }

}