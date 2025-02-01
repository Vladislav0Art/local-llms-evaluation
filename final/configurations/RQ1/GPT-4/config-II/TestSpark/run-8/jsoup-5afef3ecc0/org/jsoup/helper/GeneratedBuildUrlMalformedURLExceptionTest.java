package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildUrlMalformedURLExceptionTest {

    @Test
    public void buildUrlMalformedURLExceptionTest() throws MalformedURLException {
        URL url = new URL("http://");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.build();
    }

}