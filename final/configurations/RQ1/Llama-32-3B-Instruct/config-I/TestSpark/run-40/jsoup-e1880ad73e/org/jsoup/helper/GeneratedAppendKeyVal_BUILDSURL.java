package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyVal_BUILDSURL {

    @Test
    public void appendKeyVal_BUILDSURL() throws MalformedURLException, URISyntaxException {
        String url = "http://example.com/path";
        UrlBuilder builder = new UrlBuilder(url);
        String query = "key=value&another+key=anothervalu";
        assertEquals("key=value&another%2Bkey=anothervalu", (builder.u.getQuery() != null ? builder.u.getQuery().toString() : "").replaceAll("/$", ""));
    }

}