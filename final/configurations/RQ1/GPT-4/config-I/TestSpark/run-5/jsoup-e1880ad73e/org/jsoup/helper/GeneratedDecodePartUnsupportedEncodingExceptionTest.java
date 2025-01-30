package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.mockito.Mockito.*;

public class GeneratedDecodePartUnsupportedEncodingExceptionTest {

    @Test
    public void decodePartUnsupportedEncodingExceptionTest() throws MalformedURLException {
        URL urlMock = mock(URL.class);
        when(urlMock.getHost()).thenReturn("\ud83d\ude02"); // emoji

        UrlBuilder urlBuilder = new UrlBuilder(urlMock);
        urlBuilder.build();
    }

}