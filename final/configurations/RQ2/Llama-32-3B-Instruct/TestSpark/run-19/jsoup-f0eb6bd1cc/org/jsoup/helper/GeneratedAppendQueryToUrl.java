package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendQueryToUrl {

    @Test
    public void appendQueryToUrl() throws MalformedURLException, URISyntaxException {
        String queryValue = "query=value";
        URI uri = new URI("http://example.com/path").resolve(queryValue);
        new UrlBuilder(new URL(uri)).build().toString();
    }

}