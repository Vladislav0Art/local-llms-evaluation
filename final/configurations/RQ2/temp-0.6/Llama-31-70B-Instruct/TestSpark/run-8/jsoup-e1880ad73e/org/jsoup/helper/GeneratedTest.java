package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.Connection;

import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void build_NullInput_ThrowsNullPointerException() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        assertThrows(NullPointerException.class, urlBuilder::build);
    }

    @Test
    public void build_ValidInput_ReturnsCorrectUrl() throws Exception {
        URL inputUrl = new URL("https://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL actualUrl = urlBuilder.build();
        assertEquals(inputUrl, actualUrl);
    }

}