package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedBuild_urlWithParams {

    @Test
    public void build_urlWithParams() {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com?a=1&b=2");
        assertEquals("http://example.com?a=1&b=2", urlBuilder.build().toString());
    }

}