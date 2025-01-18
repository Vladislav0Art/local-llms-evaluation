package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedTest {

    @Test
    public void urlBuilderConstructTest() throws Exception {
        URL inputUrl = new URL("http://example.com");

        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        Assert.assertNotNull(urlBuilder);
    }

    @Test
    public void buildTest() throws Exception {
        URL inputUrl = new URL("http://example.com");

        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        URL resultUrl = urlBuilder.build();

        Assert.assertEquals(inputUrl, resultUrl);
    }

}