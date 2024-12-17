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
import java.nio.charset.StandardCharsets;

import org.jsoup.Connection.KeyVal;

public class GeneratedCreateUrlBuilderWithNullQuery {

    @Test
    public void createUrlBuilderWithNullQuery() {
        URL url = new URL("https://example.com/path?query=value#fragment");
        UrlBuilder builder = new UrlBuilder(url);
        assertNull(builder.q);
    }

}