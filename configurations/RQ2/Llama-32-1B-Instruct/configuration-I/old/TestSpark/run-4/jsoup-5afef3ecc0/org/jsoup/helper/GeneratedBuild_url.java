package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import java.net.URL;

public class GeneratedBuild_url {

    @Test
    public void build_url() {
        String expectedUrl = "http://example.com";
        URL actualUrl = new UrlBuilder(new URL(expectedUrl)).build();
        assertEquals(expectedUrl, actualUrl.toString());
    }

}