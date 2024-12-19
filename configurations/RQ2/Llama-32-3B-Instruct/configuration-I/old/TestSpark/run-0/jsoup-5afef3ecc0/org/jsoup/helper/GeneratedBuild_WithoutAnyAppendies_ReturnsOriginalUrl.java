package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.UrlBuilder;

public class GeneratedBuild_WithoutAnyAppendies_ReturnsOriginalUrl {

    @Test
    public void build_WithoutAnyAppendies_ReturnsOriginalUrl() {
        String originalUrl = "http://example.com";
        UrlBuilder builder = new UrlBuilder(new URL(originalUrl));
        assertEquals(originalUrl, builder.build().toString());
    }

}