package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedTest {

    @Test
    public void UrlBuilder_ValidInput_Test() throws Exception {
        URL inputUrl = new URL("http://www.test.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        Assert.assertNotNull(builder);
    }

    @Test
    public void UrlBuilder_NullInput_Test() {
        UrlBuilder builder = new UrlBuilder(null);
    }

    @Test
    public void build_ValidUrl_Test() throws Exception {
        URL inputUrl = new URL("http://www.test.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL outputUrl = builder.build();
        Assert.assertEquals(inputUrl, outputUrl);
    }

    @Test
    public void build_InvalidUrl_Test() throws Exception {
        URL inputUrl = new URL("http://this is not a url");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        builder.build();
    }

}