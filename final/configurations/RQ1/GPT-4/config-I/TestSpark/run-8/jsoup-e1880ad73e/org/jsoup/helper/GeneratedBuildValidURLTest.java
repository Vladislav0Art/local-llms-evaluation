package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URISyntaxException;
import java.net.MalformedURLException;

import static org.mockito.Mockito.*;

import org.mockito.Mockito;

public class GeneratedBuildValidURLTest {

    @Test
    public void buildValidURLTest() throws MalformedURLException {
        URL validUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(validUrl);
        Assert.assertEquals("http://example.com", urlBuilder.build().toString());
    }

}