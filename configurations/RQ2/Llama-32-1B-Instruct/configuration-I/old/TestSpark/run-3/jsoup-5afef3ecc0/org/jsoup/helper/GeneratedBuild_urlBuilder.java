package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedBuild_urlBuilder {

    @Test
    public void build_urlBuilder() {
        String url = "https://example.com";
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals(url, builder.build().getURI());
    }

}