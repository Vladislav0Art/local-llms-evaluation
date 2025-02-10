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

import static org.mockito.Mockito.when;

public class GeneratedWithPath {

    @Test
    public void withPath() {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path/to/resource"));
        URI uri = ((URL) builder.build()).toURI();
        assertEquals("/path/to/resource", uri.getPath());
    }

}