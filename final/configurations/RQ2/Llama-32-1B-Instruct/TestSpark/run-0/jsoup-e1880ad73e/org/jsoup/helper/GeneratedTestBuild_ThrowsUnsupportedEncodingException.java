package org.jsoup.helper;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

public class GeneratedTestBuild_ThrowsUnsupportedEncodingException {

    @Test
    public void testBuild_ThrowsUnsupportedEncodingException() {
        String inputUrl = "https://example.com/path?a=b&c=d";
        try {
            URLBuilder builder = new UrlBuilder(inputUrl);
            builder.build(); // throws UnsupportedEncodingException
        } catch (UnsupportedEncodingException e) {
            assertEquals("UnsupportedEncodingException", e.getMessage());
        }
    }

}