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

public class GeneratedUrlBuilderAppendKeyValTest {

    private URL url;

    @Before
    public void setUp() throws MalformedURLException {
        url = new URL("http://example.com/");
    }

    @Test
    public void urlBuilderAppendKeyValTest() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));
        Assert.assertNotNull(urlBuilder.q);
    }

}