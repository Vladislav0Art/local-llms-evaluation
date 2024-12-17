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

public class GeneratedTestBuildUrlWithQuery {

    @Test
    public void testBuildUrlWithQuery() throws Exception {
        URL url = new URL("http://example.com?query=abc&def=ghi");
        UrlBuilder builder = new UrlBuilder(url);
        String expectedQueryString = "query1=" + URLEncoder.encode("abc", "UTF-8") + "&def=" + URLEncoder.encode("ghi", "UTF-8");
        assertEquals(expectedQueryString, (String) builder.build().getQuery());
    }

}