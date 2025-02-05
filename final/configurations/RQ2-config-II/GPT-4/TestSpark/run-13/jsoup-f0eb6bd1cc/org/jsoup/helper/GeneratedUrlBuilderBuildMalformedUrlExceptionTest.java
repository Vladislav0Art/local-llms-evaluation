package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedUrlBuilderBuildMalformedUrlExceptionTest {

    @Test
    public void UrlBuilderBuildMalformedUrlExceptionTest() {
        URL url = new URL("sampleMalformedUrl");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.build();
    }

}