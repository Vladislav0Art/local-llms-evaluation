package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedBuildThrowsUnsupportedEncodingException {

    @Test
    public void buildThrowsUnsupportedEncodingException() {
        String inputUrl = "https://example.com/path";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        try {
            urlBuilder.build();
            fail("Expected UnsupportedEncodingException");
        } catch (org.apache.http.client.methods.UnsupportedEncodingException e) {
            // Expected exception
        }
    }

}