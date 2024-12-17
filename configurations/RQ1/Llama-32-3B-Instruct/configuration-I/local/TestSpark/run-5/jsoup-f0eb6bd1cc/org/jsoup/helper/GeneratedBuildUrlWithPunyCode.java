package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedBuildUrlWithPunyCode {

    @Test
    public void buildUrlWithPunyCode() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com/éäöü?query=abc&def=ghi#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertSame(inputUrl, urlBuilder.build());
    }

}