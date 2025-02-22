package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GeneratedTest {

    @Test
    public void buildUrlWithURI() throws URISyntaxException, MalformedURLException {
        URL inputUrl = new URL("http://example.com/path?query");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL expectedUrl = new URL("http://example.com/path?query");

        URL actualUrl = urlBuilder.build();

        Assert.assertEquals(expectedUrl.toExternalForm(), actualUrl.toExternalForm());
        Assert.assertEquals(expectedUrl.getProtocol(), actualUrl.getProtocol());
        Assert.assertEquals(expectedUrl.getHost(), actualUrl.getHost());
        Assert.assertEquals(expectedUrl.getPath(), actualUrl.getPath());
        Assert.assertEquals(expectedUrl.getQuery(), actualUrl.getQuery());
        Assert.assertEquals(expectedUrl.getRef(), actualUrl.getRef());
    }

}