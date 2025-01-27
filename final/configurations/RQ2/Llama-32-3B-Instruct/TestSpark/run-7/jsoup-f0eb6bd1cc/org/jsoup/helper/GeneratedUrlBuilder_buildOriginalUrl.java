package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedUrlBuilder_buildOriginalUrl {

    @Test
    public void urlBuilder_buildOriginalUrl() {
        URL inputUrl = new URL("https://example.com/path?query=value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL expectedUrl = new URL("https://example.com/path?query=value");
        assertEquals(expectedUrl, urlBuilder.build());
    }

}