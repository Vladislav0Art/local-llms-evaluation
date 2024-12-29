package org.jsoup.helper;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

public class GeneratedTestBuild_NullConnection {

    @Test
    public void testBuild_NullConnection() {
        String inputUrl = "https://example.com/path?a=b&c=d";
        UrlBuilder builder = new UrlBuilder(inputUrl);
        try {
            builder.build(); // throws UnsupportedEncodingException
        } catch (UnsupportedEncodingException e) {
            assertEquals("null", e.getMessage());
        }
    }

}