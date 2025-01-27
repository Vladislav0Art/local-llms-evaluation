package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildUrlFromNull {

    @Test
    public void buildUrlFromNull() {
        assertFalse(new UrlBuilder(null).build().toString());
    }

}