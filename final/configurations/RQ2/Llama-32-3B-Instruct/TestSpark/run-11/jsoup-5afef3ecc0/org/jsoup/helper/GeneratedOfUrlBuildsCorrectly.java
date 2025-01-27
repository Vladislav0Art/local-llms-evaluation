package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.jsoup.internal.StringUtil;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedOfUrlBuildsCorrectly {

    @Test
    public void ofUrlBuildsCorrectly() throws MalformedURLException {
        String url = Connection.url("https://example.com");
        assertNotNull(url);
    }

}