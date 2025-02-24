package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.Connection;

import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedBuild_ValidInput_ReturnsCorrectUrl {

    @Test
    public void build_ValidInput_ReturnsCorrectUrl() throws Exception {
        URL inputUrl = new URL("https://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL actualUrl = urlBuilder.build();
        assertEquals(inputUrl, actualUrl);
    }

}