package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;

public class GeneratedUrlBuilderConstructorNullTest {

    @Test
    public void urlBuilderConstructorNullTest() throws MalformedURLException {
        URL testUrl = null;
        new UrlBuilder(testUrl);
    }

}