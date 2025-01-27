package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildUrlFromEmptyString {

    @Test
    public void buildUrlFromEmptyString() {
        assertEquals("", new UrlBuilder("").build().toString());
    }

}