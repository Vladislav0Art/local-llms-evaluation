package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

public class GeneratedBuild_urlWithoutQuery {

    @Test
    public void build_urlWithoutQuery() throws MalformedURLException, URISyntaxException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        URL result = urlBuilder.build();
        assertEquals("http://example.com", result.toString());
    }

}