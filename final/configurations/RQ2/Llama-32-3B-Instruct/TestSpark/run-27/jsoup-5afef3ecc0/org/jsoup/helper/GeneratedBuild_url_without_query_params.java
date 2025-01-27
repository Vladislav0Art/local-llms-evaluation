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

import static org.mockito.Mockito.*;

public class GeneratedBuild_url_without_query_params {

    @Test
    public void build_url_without_query_params() {
        UrlBuilder builder = new UrlBuilder("http://example.com", 0);
        assertEquals(new URL("http://example.com"), builder.build());
    }

}

class UrlBuilder {
    private String url;
    private int port;

    public UrlBuilder(String url, int port) {
        this.url = url;
        this.port = port;
    }

    public URL build() throws MalformedURLException {
        return new URL(url + (port > 0 ? ":" + port : ""));
    }

}