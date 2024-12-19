package org.jsoup.helper;

import org.junit.Test;

import java.io.IOException;
import java.net.URL;

public class GeneratedBuild_ValidUrl_ReturnsValidUrl {

    @Test
    public void build_ValidUrl_ReturnsValidUrl() {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        URL expectedUrl = new URL("http://example.com");
        when(urlBuilder.inputUrl()).thenReturn(expectedUrl);
        URL actualUrl = urlBuilder.build();
        assertEquals(expectedUrl, actualUrl);
    }

}