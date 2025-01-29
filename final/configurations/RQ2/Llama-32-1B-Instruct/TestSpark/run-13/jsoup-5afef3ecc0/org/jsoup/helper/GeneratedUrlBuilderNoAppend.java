package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedUrlBuilderNoAppend {

    @Test
    public void urlBuilderNoAppend() {
        String inputUrl = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertNotSame(urlBuilder.build(), null);
        assertNotSame(urlBuilder.appendKeyVal(null), null);
    }

}