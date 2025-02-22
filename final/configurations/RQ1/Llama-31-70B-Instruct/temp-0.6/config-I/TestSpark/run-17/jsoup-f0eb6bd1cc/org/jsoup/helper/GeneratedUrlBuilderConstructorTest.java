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

public class GeneratedUrlBuilderConstructorTest {

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

}