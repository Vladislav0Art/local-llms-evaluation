package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

import static org.mockito.Mockito.*;

public class GeneratedBuildInvalidURLTest {

    @Test
    public void buildInvalidURLTest() throws MalformedURLException, URISyntaxException {
        URL url = new URL("https://:mysite.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.build();
    }

}