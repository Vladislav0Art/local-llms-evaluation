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

public class GeneratedAppendQueryParamsCorrectly {

    @Test
    public void appendQueryParamsCorrectly() throws MalformedURLException, UnsupportedEncodingException {
        String url = Connection.url("https://example.com")
                .appendQueryParams(new java.util.HashMap<String, String>() {{
                    put("key1", "value1");
                    put("key2", "value2");
                }});
        assertTrue(url.contains("?key1=value1&key2=value2"));
    }

}