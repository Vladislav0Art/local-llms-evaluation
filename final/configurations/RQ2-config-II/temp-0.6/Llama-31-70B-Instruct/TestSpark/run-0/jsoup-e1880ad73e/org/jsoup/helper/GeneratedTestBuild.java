package org.jsoup.helper;

import static org.jsoup.helper.DataUtil.UTF_8;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;

public class GeneratedTestBuild {

    private UrlBuilder urlBuilder;

    @Test
    public void testBuild() {
        URL inputUrl = null;
        try {
            inputUrl = new URL("http://www.example.com");
        } catch (MalformedURLException e) {
            fail("Invalid URL: " + e.getMessage());
        }
        urlBuilder = new UrlBuilder(inputUrl);
        URL normalizedUrl = urlBuilder.build();
        assertEquals("http://www.example.com", normalizedUrl.toString());
    }

}