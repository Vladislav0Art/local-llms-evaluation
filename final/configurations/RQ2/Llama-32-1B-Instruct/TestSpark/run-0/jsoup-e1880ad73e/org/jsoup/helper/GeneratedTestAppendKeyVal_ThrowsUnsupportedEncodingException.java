package org.jsoup.helper;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal_ThrowsUnsupportedEncodingException {

    @Test
    public void testAppendKeyVal_ThrowsUnsupportedEncodingException() {
        String inputUrl = "https://example.com/path?a=b";
        try {
            URLBuilder builder = new UrlBuilder(inputUrl);
            builder.appendKeyVal(new UnsupportedEncodingException()); // throws UnsupportedEncodingException
        } catch (UnsupportedEncodingException e) {
            assertEquals("UnsupportedEncodingException", e.getMessage());
        }
    }

}