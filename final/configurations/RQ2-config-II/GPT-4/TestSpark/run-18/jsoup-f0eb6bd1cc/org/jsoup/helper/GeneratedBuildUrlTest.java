package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.UnsupportedEncodingException;

import static org.mockito.Mockito.*;

public class GeneratedBuildUrlTest {

    @Test
    public void buildUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL resultUrl = builder.build();
        Assert.assertEquals(resultUrl, inputUrl);
    }

}