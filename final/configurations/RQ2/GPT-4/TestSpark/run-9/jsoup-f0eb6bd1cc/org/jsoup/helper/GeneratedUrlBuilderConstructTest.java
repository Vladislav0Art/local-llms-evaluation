package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedUrlBuilderConstructTest {

    @Test
    public void urlBuilderConstructTest() throws Exception {
        URL inputUrl = new URL("http://example.com");

        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        Assert.assertNotNull(urlBuilder);
    }

}