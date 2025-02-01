package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedBuildInvalidUrlTest {

    @Test
    public void buildInvalidUrlTest() {
        URL url = Mockito.mock(URL.class);
        Mockito.when(url.getProtocol()).thenReturn("][");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.build();
    }

}