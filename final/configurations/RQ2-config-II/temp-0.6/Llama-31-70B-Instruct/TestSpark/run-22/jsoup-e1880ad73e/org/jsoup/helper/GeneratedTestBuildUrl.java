package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.jsoup.helper.DataUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class GeneratedTestBuildUrl {

    private UrlBuilder urlBuilder;
    private URL inputUrl;

    @Before
    public void setUp() throws MalformedURLException {
        inputUrl = new URL("http://example.com/test?q=123");
        urlBuilder = new UrlBuilder(inputUrl);
    }

    @Test
    public void testBuildUrl() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        URL builtUrl = urlBuilder.build();
        Assert.assertEquals("http://xn--example-hva.com/test?q=123", builtUrl.toString());
    }

}