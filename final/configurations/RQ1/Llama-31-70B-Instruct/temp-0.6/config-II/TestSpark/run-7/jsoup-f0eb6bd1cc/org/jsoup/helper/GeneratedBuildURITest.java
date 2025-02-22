package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;

import static org.jsoup.helper.DataUtil.UTF_8;
import static org.junit.Assert.assertEquals;

public class GeneratedBuildURITest {

    @Test
    public void buildURITest() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        URL inputUrl = new URL("https://example.com/path?query=value#fragment");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL expectedUrl = new URL("https://example.com/path?query=value#fragment");

        URL actualUrl = builder.build();

        assertEquals(expectedUrl, actualUrl);
    }

}