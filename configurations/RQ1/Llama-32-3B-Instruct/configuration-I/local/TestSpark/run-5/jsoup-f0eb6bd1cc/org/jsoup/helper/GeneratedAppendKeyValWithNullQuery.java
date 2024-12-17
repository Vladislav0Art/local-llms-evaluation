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

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedAppendKeyValWithNullQuery {

    @Test
    public void appendKeyValWithNullQuery() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com/path"));
        urlBuilder.appendKeyVal(null);
        assertNull(urlBuilder.q);
    }

}