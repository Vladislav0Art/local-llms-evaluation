package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

public class GeneratedBuild_urlWithQuery {

    @Test
    public void build_urlWithQuery() throws MalformedURLException, URISyntaxException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com?param=value"));
        URL result = urlBuilder.build();
        assertEquals("http://example.com?param=value", result.toString());
    }

}