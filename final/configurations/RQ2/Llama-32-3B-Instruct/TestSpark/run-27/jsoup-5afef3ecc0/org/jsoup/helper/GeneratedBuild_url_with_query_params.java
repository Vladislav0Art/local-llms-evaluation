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

import static org.mockito.Mockito.*;

public class GeneratedBuild_url_with_query_params {

    @Test
    public void build_url_with_query_params() {
        UrlBuilder builder = new UrlBuilder("http://example.com?param=value&other=abc", 0);
        assertEquals(new URL("http://example.com?param=value&other=abc"), builder.build());
    }

}