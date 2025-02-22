package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class GeneratedTest {

    private URL url;

    @Before
    public void setUp() throws MalformedURLException {
        url = new URL("http://example.com/");
    }

    @Test
    public void urlBuilderConstructorTest() {
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Assert.assertNotNull(urlBuilder.u);
    }

    @Test
    public void urlBuilderBuildTest() {
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Assert.assertNotNull(urlBuilder.build());
    }

    @Test
    public void urlBuilderBuildExceptionTest() throws MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example"));
        urlBuilder.build();
    }

    @Test
    public void urlBuilderAppendKeyValTest() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));
        Assert.assertNotNull(urlBuilder.q);
    }

    @Test
    public void urlBuilderAppendKeyValExceptionTest() {
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", null));
        Assert.assertNotNull(urlBuilder.q);
    }

    @Test
    public void urlBuilderDecodePartTest() {
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Assert.assertEquals("abc", urlBuilder.decodePart("abc"));
    }

}