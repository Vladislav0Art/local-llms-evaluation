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

public class GeneratedAppendFragmentCorrectly {

    @Test
    public void appendFragmentCorrectly() throws MalformedURLException {
        String url = Connection.url("https://example.com").appendFragment("#fragment");
        assertTrue(url.contains("#fragment"));
    }
}

public class Connection {

    private static final java.net.URL base;

    static {
        try {
            base = new java.net.URL("https://example.com");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public String url(String path) throws MalformedURLException, UnsupportedEncodingException {
        return base.resolve(path).toString();
    }

    public Connection appendQueryParam(String key, String value) throws MalformedURLException, UnsupportedEncodingException {
        return appendQueryParams(new java.util.HashMap<String, String>() {{
            put(key, value);
        }});
    }

    public Connection appendQueryParams(java.util.Map<String, String> params) throws MalformedURLException, UnsupportedEncodingException {
        if (params.isEmpty()) {
            return this;
        }
        String query = "";
        for (java.util.Map.Entry<String, String> entry : params.entrySet()) {
            if (!query.isEmpty()) {
                query += "&";
            }
            query += entry.getKey() + "=" + URLEncoder.encode(entry.getValue(), "UTF-8");
        }
        return appendQuery(query);
    }

    public Connection appendFragment(String fragment) {
        return this.appendFragment(fragment);
    }

    private Connection appendQuery(String query) throws MalformedURLException, UnsupportedEncodingException {
        if (query.isEmpty()) {
            return this;
        }
        return new Connection(base.resolve().resolve(query));
    }

}