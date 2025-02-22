package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection.KeyVal;

import java.net.URL;
import java.net.URLEncoder;
import java.net.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URI;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedBuildUrlWithQueryTest {

    @Test
    public void buildUrlWithQueryTest() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        URL inputUrl = new URL("https://www.example.com/test?key=value");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL outputUrl = builder.build();
        Assert.assertEquals("https://www.example.com/test?key=value", outputUrl.toString());
    }

}