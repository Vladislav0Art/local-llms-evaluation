package org.jsoup.helper;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal_NullConnection {

    @Test
    public void testAppendKeyVal_NullConnection() {
        String inputUrl = "https://example.com/path?a=b&c=d";
        UrlBuilder builder = new UrlBuilder(inputUrl);
        try {
            builder.appendKeyVal(null); // throws UnsupportedEncodingException
        } catch (UnsupportedEncodingException e) {
            assertEquals("null", e.getMessage());
        }
    }

}