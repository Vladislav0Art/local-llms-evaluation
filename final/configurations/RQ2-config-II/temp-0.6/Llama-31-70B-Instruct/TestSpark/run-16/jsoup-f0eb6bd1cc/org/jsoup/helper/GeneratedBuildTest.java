package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import static org.jsoup.helper.DataUtil.UTF_8;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildTest {

    @Test
    public void buildTest() throws URISyntaxException, MalformedURLException {
        URL url = new URL("https://example.com/");
        UrlBuilder builder = new UrlBuilder(url);
        URL builtUrl = builder.build();
        Assert.assertEquals("https://example.com/", builtUrl.toString());
    }

}