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

public class GeneratedBuildUrlWithFragment {

    @Test
    public void buildUrlWithFragment() throws Exception {
        String expectedUrl = "https://example.com/path?a=1&b=2#fragment";
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com/path?query=value#other"));
        assertEquals(expectedUrl, builder.u.toString());
    }

}