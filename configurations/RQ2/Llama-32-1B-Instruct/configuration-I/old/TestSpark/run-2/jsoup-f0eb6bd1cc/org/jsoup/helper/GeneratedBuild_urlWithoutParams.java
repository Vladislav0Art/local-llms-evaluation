package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedBuild_urlWithoutParams {

    @Test
    public void build_urlWithoutParams() {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        assertEquals("http://example.com", urlBuilder.build().toString());
    }

}