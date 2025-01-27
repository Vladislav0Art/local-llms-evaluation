package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
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

public class GeneratedBuildUrlDecoded {

    @Test
    public void buildUrlDecoded() throws MalformedURLException, URISyntaxException {
        String url = "http://example.com/path%20with%20spaces";
        URL urlObj = new URL(url);
        UrlBuilder builder = new UrlBuilder(urlObj);
        URL result = builder.build();
        assertEquals("http://example.com/path with spaces", URLUtil.toString(result));
    }

}