package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendFragmentToUrl {

    @Test
    public void appendFragmentToUrl() throws MalformedURLException, URISyntaxException {
        String fragmentValue = "#fragment";
        URI uri = new URI("http://example.com/path?query=value#fragment");
        new UrlBuilder(new URL(uri)).appendKeyVal(Connection.KeyVal.valueOf("_", fragmentValue)).build().toString();
    }

}