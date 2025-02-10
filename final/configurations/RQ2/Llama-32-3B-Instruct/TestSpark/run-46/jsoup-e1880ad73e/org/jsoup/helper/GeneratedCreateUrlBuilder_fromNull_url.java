package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.jsoup.Connection;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedCreateUrlBuilder_fromNull_url {

    @Test
    public void createUrlBuilder_fromNull_url() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
    }

}