package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.Connection;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;
import java.net.UnsupportedEncodingException;

public class GeneratedBuildMalformedUrlTest {

    @Test
    public void buildMalformedUrlTest() throws MalformedURLException, UnsupportedEncodingException, URISyntaxException {
        URL url = Mockito.mock(URL.class);
        Mockito.when(url.getProtocol()).thenThrow(new MalformedURLException());
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.build();
    }

}